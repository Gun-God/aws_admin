package cn.timelost.aws.vo.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author: hyw
 * @Date: 2022/12/28 17:41
 */
@Data
public class PersonalForm {
    @NotBlank(message = "姓名必填")
    private String name;
    @NotNull(message = "性别必填")
    private Integer gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;
    private Long phone;
    private String email;
    private String identity;
    private String education;
    private String school;
    private String imgUrl;
    private Integer workStatus;
    private Integer departmentId;
    private Integer positionId;
    private Date beginDate;
}
