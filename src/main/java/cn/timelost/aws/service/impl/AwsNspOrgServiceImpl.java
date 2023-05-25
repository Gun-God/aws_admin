package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.mapper.AwsUserMapper;
import cn.timelost.aws.service.AwsNspOrgService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 检测站信息表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsNspOrgServiceImpl extends ServiceImpl<AwsNspOrgMapper, AwsNspOrg> implements AwsNspOrgService {

    @Autowired
    AwsNspOrgMapper orgMapper;

    @Autowired
    AwsUserMapper userMapper;

    @Override
    public PageInfo<AwsNspOrg> findList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AwsNspOrg> orgs = orgMapper.selectList(new QueryWrapper<AwsNspOrg>().eq("state", 1));
        return new PageInfo<>(orgs);
    }

    @Override
    public ResultVo deleteById(int id) {
        AwsNspOrg org = orgMapper.selectById(id);
        if (org == null)
            return ResultVo.fail(ResultEnum.ORG_NOT_EXIST);
        org.setState(0);
        if (orgMapper.updateById(org)==0)
            return ResultVo.fail(ResultEnum.ERROR);
        return ResultVo.success();
    }

    @Override
    public ResultVo insert(AwsNspOrg org) {
        AwsNspOrg nspOrg = orgMapper.selectOne(new QueryWrapper<AwsNspOrg>().eq("code", org.getCode()));
        if (nspOrg != null)
            return ResultVo.fail(ResultEnum.ORG_CODE_NOT_EXIST);
        AwsUser user = userMapper.selectOne(new QueryWrapper<AwsUser>().eq("username", UserRealm.USERNAME));
        org.setOper(user.getUserCode() + "-" + user.getName());
        if (orgMapper.insert(org) == 0)
            return ResultVo.fail(ResultEnum.ERROR);
       // org.setId(size+1);
        org.setState(1);
        return ResultVo.success();
    }

    @Override
    public ResultVo updateUserById(AwsNspOrg org) {
        if (orgMapper.updateById(org)==0)
            return ResultVo.fail(ResultEnum.ERROR);
        return ResultVo.success();
    }
}
