package cn.timelost.aws.mapper;

import cn.timelost.aws.entity.AwsSystemErrLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 系统错误信息记录表 Mapper 接口
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Mapper
public interface AwsSystemErrLogMapper extends BaseMapper<AwsSystemErrLog> {

}
