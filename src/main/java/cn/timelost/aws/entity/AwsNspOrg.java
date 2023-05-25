package cn.timelost.aws.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 检测站信息表
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AwsNspOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 编号
     */
    private String code;

    /**
     * 检测站全称
     */
    private String name;

    /**
     * 检测站简称
     */
    private String shortName;

    /**
     * 状态（0不可用1可用）
     */
    private Integer state;

    /**
     * 位置
     */
    private String location;

    /**
     * 检测站类型(0预检站 1精检站)
     */
    private Integer type;

    /**
     * 建成时间
     */
    private Date buildTime;

    /**
     * 车道数
     */
    private Integer lane;

    /**
     * 桩号
     */
    private String pileNo;

    /**
     * 方向（0上行1下行）
     */
    private Integer direction;

    /**
     * 所属高速
     */
    private String expressway;

    /**
     * 操作员
     */
    private String oper;
}
