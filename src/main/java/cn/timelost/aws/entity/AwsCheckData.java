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
 * 精检信息记录表
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AwsCheckData implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 流水号
     */
    private String code;

    /**
     * 车型
     */
    private Integer carTypeId;

    /**
     * 车牌
     */
    private String carNo;

    /**
     * 车道
     */
    private Integer lane;

    /**
     * 初检重量
     */
    private Double amt;

    /**
     * 初检超重
     */
    private Double overAmt;

    /**
     * 货物名称
     */
    private String goods;

    /**
     * 司机
     */
    private Integer driver;

    /**
     * 初检时间
     */
    private Date createTime;

    /**
     * 操作员
     */
    private String operName;

    /**
     * 复检时间
     */
    private Date checkTime;

    /**
     * 复检重量
     */
    private Double checkAmt;

    /**
     * 卸重
     */
    private Double checkUnload;

    /**
     * 复检员
     */
    private String checkOper;

    private String img1;

    private String img2;

    private String img3;

    /**
     * 预检流水号
     */
    private String preNo;

    /**
     * 出战状态
     */
    private Integer leaveState;

    /**
     * 检测站
     */
    private String orgCode;

    /**
     * 精检站编号
     * */
    private String checkOrgCode;


    /**
     * 驾驶员姓名
     * */
    private String driverName;

}
