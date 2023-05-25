package cn.timelost.aws.mapper;

import cn.timelost.aws.entity.AwsSystemLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 系统定时任务记录表 Mapper 接口
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Mapper
public interface AwsSystemLogMapper extends BaseMapper<AwsSystemLog> {

}
