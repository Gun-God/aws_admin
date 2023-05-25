package cn.timelost.aws.vo.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author: hyw
 * @Date: 2023/1/7 9:56
 */
@Data
public class PersonalSalaryForm {
    private Integer personalId;
    @NotNull(message = "时间必填")
    @JsonFormat(
            pattern = "yyyy-MM",
            timezone = "GMT+8"
    )
    private Date salaryMonth;
    @NotNull(message = "基本工资必填")
    private Double basisSalary;
    private Double subsidySalary;
    private Double socialSalary;
    private Double providentFund;
    private Double bonus;
    private Double tax;
}
