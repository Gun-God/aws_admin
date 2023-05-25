package cn.timelost.aws.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AwsUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录签名
     */
    private String salt;

    /**
     * 角色
     */
    private Integer roleId;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 账号状态（0删除1正常）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date creatTime;

    /**
     * 座机
     */
    private String phone;

    /**
     * 手机
     */
    private String mobilePhone;

    /**
     * 性别（0男1女）
     */
    private Integer sex;

    /**
     * 监测站id
     */
    private String orgCode;

    /**
     * 串口信息
     */
    private String credit;

    /**
     * 修改时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private String orgName;


}
