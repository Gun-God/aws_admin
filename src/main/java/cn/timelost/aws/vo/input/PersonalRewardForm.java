package cn.timelost.aws.vo.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author: hyw
 * @Date: 2023/1/4 12:05
 */
@Data
public class PersonalRewardForm {

    private Integer personalId;
    @NotNull(message = "时间必填")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date rewardDate;
    @NotNull(message = "奖惩类型必填")
    private Integer rewardKind;
    private Long rewardAmount;
    private String description;
}
