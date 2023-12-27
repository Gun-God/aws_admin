package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsDownloadLog;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.mapper.AwsDownloadLogMapper;
import cn.timelost.aws.service.AwsDownloadLogService;
import cn.timelost.aws.service.AwsUserService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class AwsDownloadLogServiceImpl extends ServiceImpl<AwsDownloadLogMapper, AwsDownloadLog> implements AwsDownloadLogService{

    @Autowired
    private AwsDownloadLogMapper awsDownloadLogMapper;
    @Autowired
    AwsUserService userService;


    public AwsDownloadLog createDownloadLog(AwsDownloadLog awsDownloadLog)
    {

        awsDownloadLog.setState(0);
        awsDownloadLog.setPercent(0.0);
        String uname=UserRealm.USERNAME;
        AwsUser us=userService.findByUsername(uname);
        awsDownloadLog.setUserId(us.getId());
        awsDownloadLog.setOper(us.getUserCode()+us.getName());
        awsDownloadLog.setOrgCode(us.getOrgCode());
        awsDownloadLog.setOperTime(new Date());
        int i=awsDownloadLogMapper.insert(awsDownloadLog);

        if(i==0)
        {
            return null;
        }else {
            return awsDownloadLog;
        }
    }

}
