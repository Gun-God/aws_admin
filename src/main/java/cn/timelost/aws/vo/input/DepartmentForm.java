package cn.timelost.aws.vo.input;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author: hyw
 * @Date: 2022/12/25 12:04
 */
@Data
public class DepartmentForm{

    @NotBlank(message = "部门名称必填")
    private String departmentName;
    private String description;
}
