package cn.timelost.aws.vo.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author: hyw
 * @Date: 2023/1/7 19:37
 */
@Data
public class RecruitmentForm {
    @NotBlank(message = "部门必填")
    private String departmentName;
    @NotBlank(message = "岗位必填")
    private String positionName;
    @NotNull(message = "需求人数必填")
    private Integer needNum;
    @NotNull(message = "招聘内容必填")
    private String demand;
    private String needEducation;
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date startDate;
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date endTime;
    private Integer recruitStatus;
}
