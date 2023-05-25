package cn.timelost.aws.entity.vo;

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
public class AwsSystemSettingForm {

    /**
     * 参数名称
     */
    private Integer id;

    /**
     * 参数名称
     */
    private String attributeName;

    /**
     * 设定信息
     */
    private String msg;

}
