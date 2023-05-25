package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsSystemErrLog;
import cn.timelost.aws.mapper.AwsSystemErrLogMapper;
import cn.timelost.aws.service.AwsSystemErrLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统错误信息记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsSystemErrLogServiceImpl extends ServiceImpl<AwsSystemErrLogMapper, AwsSystemErrLog> implements AwsSystemErrLogService {

}
