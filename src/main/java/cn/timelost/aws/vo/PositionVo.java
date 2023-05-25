package cn.timelost.aws.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: hyw
 * @Date: 2022/12/27 19:31
 */
@Data
public class PositionVo implements Serializable {

    private static final long serialVersionUID = 7968167691662644209L;
    private Integer id;
    private String positionName;
    private String description;
    private Integer departmentId;
    private String departmentName;
    private Date createTime;
    private Date updateTime;

}
