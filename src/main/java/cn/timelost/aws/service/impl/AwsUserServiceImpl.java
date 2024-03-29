package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.utils.JWTUtils;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.entity.vo.AwsUserForm;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.mapper.AwsRoleMapper;
import cn.timelost.aws.mapper.AwsUserMapper;
import cn.timelost.aws.service.AwsUserLogService;
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
    @Autowired
    AwsUserLogService logService;
    @Autowired
    AwsNspOrgMapper nspOrgMapper;


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
        logService.InsertUserLog("删除用户"+user.getUserCode(),1);
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

        //设置roleId
//        查询他的检测站是精检还是预检
        //nspOrgMapper
        AwsNspOrg ano= nspOrgMapper.selectOne(new QueryWrapper<AwsNspOrg>().lambda().eq(AwsNspOrg::getCode,user.getOrgCode()).last("limit 1"));
        if(ano == null)
        {
            return ResultVo.fail(ResultEnum.ORG_ISNOT_EXIST);
        }

        if(ano.getType() ==0)//预检站普通用户
        user.setRoleId(2);
        else if(ano.getType() ==1)
        user.setRoleId(3);
        else
            user.setRoleId(-1);

        //性别不能为空 更新的时候会出错的
        if(user.getSex()== null)
            user.setSex(-1);

        if (userMapper.insert(user) == 0)
            return ResultVo.fail(ResultEnum.ADD_ERROR);

        logService.InsertUserLog("新增用户"+code,1);

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
        AwsNspOrg ano= nspOrgMapper.selectOne(new QueryWrapper<AwsNspOrg>().lambda().eq(AwsNspOrg::getCode,awsUser.getOrgCode()).last("limit 1"));
        if(ano == null)
        {
            return ResultVo.fail(ResultEnum.ORG_ISNOT_EXIST);
        }

        if(ano.getType() ==0)//预检站普通用户
            user.setRoleId(2);
        else if(ano.getType() ==1)
            user.setRoleId(3);
        else
            user.setRoleId(-1);

        awsUser.setUpdateTime(new Date());
        if ( userMapper.updateById(awsUser) == 0)
            return ResultVo.fail(ResultEnum.ERROR);
        logService.InsertUserLog("修改用户"+user.getUserCode(),1);
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
        logService.InsertUserLog("修改密码",1);
        return ResultVo.success();
    }

    @Override
    public ResultVo removePwd(int id) {
        AwsUser user = userMapper.selectById(id);
        if (user == null)
            return ResultVo.fail(ResultEnum.USER_NOT_EXIST);
        String salt= JWTUtils.getSalt();
        String newPassword = new Md5Hash("123456", salt, 100).toHex();
        user.setPassword(newPassword);
        user.setSalt(salt);
        userMapper.updateById(user);
        logService.InsertUserLog("重置用户密码"+user.getUserCode(),1);
        return ResultVo.success();
    }
}
