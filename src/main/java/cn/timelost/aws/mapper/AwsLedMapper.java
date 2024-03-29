package cn.timelost.aws.mapper;

import cn.timelost.aws.entity.AwsLed;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * led显示记录表 Mapper 接口
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Mapper
public interface AwsLedMapper extends BaseMapper<AwsLed> {

}
