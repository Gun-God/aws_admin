package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsSystemLog;
import cn.timelost.aws.mapper.AwsSystemLogMapper;
import cn.timelost.aws.service.AwsSystemLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统定时任务记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsSystemLogServiceImpl extends ServiceImpl<AwsSystemLogMapper, AwsSystemLog> implements AwsSystemLogService {

}
