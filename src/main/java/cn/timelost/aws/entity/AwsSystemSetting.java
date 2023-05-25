package cn.timelost.aws.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 系统参数设定表
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AwsSystemSetting implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer type;

    /**
     * 参数名称
     */
    private String attributeName;

    /**
     * 设定信息
     */
    private String msg;


}
