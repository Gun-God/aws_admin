package cn.timelost.aws.mapper;

import cn.timelost.aws.entity.AwsRolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色权限表 Mapper 接口
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Mapper
public interface AwsRolePermissionMapper extends BaseMapper<AwsRolePermission> {

}
