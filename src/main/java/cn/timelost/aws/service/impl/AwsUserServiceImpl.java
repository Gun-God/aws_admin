package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.utils.JWTUtils;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.entity.vo.AwsUserForm;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsRoleMapper;
import cn.timelost.aws.mapper.AwsUserMapper;
import cn.timelost.aws.service.AwsUserService;
import cn.timelost.aws.vo.ResultVo;
import cn.timelost.aws.vo.input.UserForm;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsUserServiceImpl extends ServiceImpl<AwsUserMapper, AwsUser> implements AwsUserService {

    @Autowired
    AwsUserMapper userMapper;
    @Autowired
    AwsRoleMapper roleMapper;


    @Override
    public AwsUser findByUsername(String username) {
        QueryWrapper<AwsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        AwsUser user = userMapper.selectOne(new QueryWrapper<AwsUser>().eq("username", username).or().eq("user_code", username));
//        if (ObjectUtils.isEmpty(user)) {
//            throw new BaseException(ResultEnum.USER_NOT_EXIST);
//        }
        return user;
    }

    @Override
    public AwsUser find(int id) {
        return null;
    }

    @Override
    public PageInfo<AwsUser> findList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AwsUser> userList = userMapper.selectAll();
        return new PageInfo<>(userList);
    }

    @Override
    public ResultVo deleteById(int id) {
        AwsUser user = userMapper.selectById(id);
        if (user == null)
            return ResultVo.fail(ResultEnum.USER_NOT_EXIST);
        user.setStatus(0);
        userMapper.updateById(user);
        return ResultVo.success();

    }

    @Override
    public ResultVo insert(AwsUser us) {
        QueryWrapper<AwsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", us.getUsername());
        // queryWrapper.or().eq("user_code", us.getUserCode());
        int count = userMapper.selectCount(queryWrapper);
        if (count != 0)
            return ResultVo.fail(ResultEnum.USER_EXIST);
        if (us.getPassword() == null || us.getPassword().equals(""))
            us.setPassword("123456");

        int size = userMapper.selectCount(null)+1;
        String no = size < 10 ? "0" + size : size + "";
        String code = "NSP00" + no;
        us.setUserCode(code);
        String salt = JWTUtils.getSalt();
        String password = new Md5Hash(us.getPassword(), salt, 100).toHex();
        AwsUser user = new AwsUser();
        BeanUtils.copyProperties(us, user);
        user.setSalt(salt);
        user.setPassword(password);
        if (userMapper.insert(user) == 0)
            return ResultVo.fail(ResultEnum.ADD_ERROR);
        return ResultVo.success();

    }

    @Override
    public ResultVo updateUserById(AwsUserForm us) {
        AwsUser user = userMapper.selectById(us.getId());
        if (user == null)
            return ResultVo.fail(ResultEnum.USER_NOT_EXIST);
        AwsUser awsUser = new AwsUser();
        BeanUtils.copyProperties(us, awsUser);
//        if (ObjectUtils.isEmpty(us.getPassword())) {
//            user.setPassword(null);
//        } else {
//            String salt = JWTUtils.getSalt();
//            String password = new Md5Hash(us.getPassword(), salt, 100).toHex();
//            user.setPassword(password);
//            user.setSalt(salt);
//        }
        awsUser.setUpdateTime(new Date());
        userMapper.updateById(awsUser);
        return ResultVo.success();
    }

    @Override
    public ResultVo modifyPwd(UserForm us) {
        String password = us.getOldPassword();
        String username = us.getUsername();
        AwsUser user = findByUsername(username);
        String salt = user.getSalt();
        String oldPassword = user.getPassword();
        String passwordMd5 = new Md5Hash(password, salt, 100).toHex();
        //生成token
        if (!oldPassword.equals(passwordMd5)) {
            return ResultVo.fail(ResultEnum.PASSWORD_ERROR);
        }
        salt = JWTUtils.getSalt();
        String newPassword = new Md5Hash(us.getPassword(), salt, 100).toHex();
        AwsUser ue = new AwsUser();
        // ue.setUsername(username);
        ue.setPassword(newPassword);
        ue.setSalt(salt);
        ue.setId(user.getId());
        userMapper.updateById(ue);
        return ResultVo.success();
    }

    @Override
    public ResultVo removePwd(int id) {
        AwsUser user = userMapper.selectById(id);
        if (user == null)
            return ResultVo.fail(ResultEnum.USER_NOT_EXIST);
        user.setStatus(0);
        String salt= JWTUtils.getSalt();
        String newPassword = new Md5Hash("123456", salt, 100).toHex();
        user.setPassword(newPassword);
        user.setSalt(salt);
        userMapper.updateById(user);
        return ResultVo.success();
    }
}
