package cn.timelost.aws.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: hyw
 * @Date: 2022/12/31 16:37
 */
@Data
public class PositionSelectVo implements Serializable {
    private static final long serialVersionUID = 2002035166649651169L;
    private Integer id;
    private String positionName;
}
