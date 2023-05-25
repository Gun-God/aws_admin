package cn.timelost.aws.vo.input;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * @author: hyw
 * @Date: 2022/12/25 18:32
 */
@Data
public class PositionForm {

    @NotBlank(message = "岗位名称必填")
    private String positionName;
    private String description;
    @NotNull(message = "部门ID必填")
    private Integer departmentId;
}
