package cn.timelost.aws.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: hyw
 * @Date: 2023/1/2 17:43
 */
@Data
public class PersonalSelectVo implements Serializable {
    private static final long serialVersionUID = 4249534101633399370L;
    private Long id;
    private String name;
    private Integer departmentId;
    private Integer positionId;
}
