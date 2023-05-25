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
 * 设备信息表
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AwsScan implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 设备编号
     */
    private String code;

    /**
     * 设备名称
     */
    private String portName;

    /**
     * 车道
     */
    private Integer lane;

    /**
     * 端口
     */
    private Integer port;

    private String udpIp;

    private String videoIp;

    /**
     * 设备类型
     */
    private String type;

    /**
     * 状态(1正常2维修)
     */
    private Integer state;

    /**
     * 操作员
     */
    private String operName;

    /**
     * 检测站
     */
    private String orgCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 设备唯一标识
     */
    private String deviceId;


}
