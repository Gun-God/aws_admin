package cn.timelost.aws.vo.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: hyw
 * @Date: 2023/1/2 16:30
 */
@Data
public class PersonalTrainForm {
    private Integer personalId;
    @NotNull(message = "时间必填")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date beginDate;
    @NotNull(message = "时间必填")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date endDate;
    private String trainContent;
    private BigDecimal trainScore;
    private BigDecimal trainCost;
    private String remake;
}
