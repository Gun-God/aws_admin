package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.entity.AwsUserLog;
import cn.timelost.aws.mapper.AwsUserLogMapper;
import cn.timelost.aws.service.AwsUserLogService;
import cn.timelost.aws.service.AwsUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 用户操作记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsUserLogServiceImpl extends ServiceImpl<AwsUserLogMapper, AwsUserLog> implements AwsUserLogService {

    @Autowired
    AwsUserLogMapper logMapper;
    @Autowired
    AwsUserService userService;

    @Override
    public void InsertUserLog(String content,int type) {
        AwsUserLog log=new AwsUserLog();
        String username= UserRealm.USERNAME;
        AwsUser user=userService.findByUsername(username);
        log.setContent(content);
        log.setOperName(user.getUserCode()+"-"+user.getName());
        log.setOperTime(new Date());
        log.setUserId(user.getId());
        log.setType(type);
        logMapper.insert(log);
    }

    @Override
    public PageInfo<AwsUserLog> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AwsUserLog> logs = logMapper.selectList(new QueryWrapper<AwsUserLog>().orderByDesc("id"));
        return new PageInfo<>(logs);
    }
}
