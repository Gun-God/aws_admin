package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsDownloadLog;
import cn.timelost.aws.mapper.AwsDownloadLogMapper;
import cn.timelost.aws.service.AwsDownloadLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class AwsDownloadLogServiceImpl extends ServiceImpl<AwsDownloadLogMapper, AwsDownloadLog> implements AwsDownloadLogService{

    @Autowired
    private AwsDownloadLogMapper awsDownloadLogMapper;

}
