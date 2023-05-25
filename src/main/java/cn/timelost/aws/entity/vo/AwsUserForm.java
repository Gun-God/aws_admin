package cn.timelost.aws.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author :hyw
 * @version 1.0
 * @date : 2023/05/16 19:10
 */
@Data
public class AwsUserForm {
    public Integer id;
    public String username;
    public String name;
    public Integer sex;
    public String phone;
    public String mobilePhone;
    public String orgCode;

}
