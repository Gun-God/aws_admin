package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsDownloadLog;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.extension.service.IService;

public interface AwsDownloadLogService extends IService<AwsDownloadLog>{

    AwsDownloadLog createDownloadLog(AwsDownloadLog awsDownloadLog);

}
