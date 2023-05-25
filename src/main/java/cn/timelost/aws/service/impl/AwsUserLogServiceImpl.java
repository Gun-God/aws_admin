package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsUserLog;
import cn.timelost.aws.mapper.AwsUserLogMapper;
import cn.timelost.aws.service.AwsUserLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
