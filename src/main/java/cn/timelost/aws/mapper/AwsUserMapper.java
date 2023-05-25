package cn.timelost.aws.mapper;

import cn.timelost.aws.entity.AwsUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Mapper
public interface AwsUserMapper extends BaseMapper<AwsUser> {

    @Select("<script>" +
            "SELECT\n" +
            "\tu.*,\n" +
            "\to.NAME org_name \n" +
            "FROM\n" +
            "\taws_user u LEFT JOIN\n" +
            "\taws_nsp_org o on \tu.org_code = o.code \n" +
            "WHERE\n" +
            "\t u.status =1" +
            "</script>")
    List<AwsUser> selectAll();



}
