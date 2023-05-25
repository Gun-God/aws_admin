package cn.timelost.aws.vo.input;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author: hyw
 * @Date: 2023/1/18 21:22
 */
@Data
public class UserForm {

    @NotBlank(message = "用户名必填")
    private String username;

    @NotBlank(message = "密码必填")
    private String password;

    private Integer roleId;
    private String code;
    private String timestamp;
    private String oldPassword;
    private Integer Id;
    private String token;
    private String orgCode;
}