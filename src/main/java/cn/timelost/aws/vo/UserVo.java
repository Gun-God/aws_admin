package cn.timelost.aws.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: hyw
 * @Date: 2023/1/20 17:39
 */
@Data
public class UserVo implements Serializable {

    private static final long serialVersionUID = -2493742024666741317L;
    private Integer id;
    private String username;
    private Integer roleId;
    private String roleDescription;
    private Integer isAdmin=1;
}
