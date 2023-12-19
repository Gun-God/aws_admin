package cn.timelost.aws.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 预检信息记录历史表
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ExportExcelSheet("PreCheckDataHistory")
public class ExcelPreCheckDataHistory implements Serializable {

    private static final long serialVersionUID = 1L;
//    @TableId(value = "id",type = IdType.AUTO)
//    private Integer id;

    /**
     * 预检流水号
     */
    @ExportExcelField(title = "预检流水号", order = 1)
    private String preNo;

    /**
     * 车牌
     */
    @ExportExcelField(title = "车辆牌照", order = 2)
    private String carNo;

    /**
     * 限重
     */
    @ExportExcelField(title = "车辆限重", order = 3)
    private Double limitAmt;

    /**
     * 轴数
     */
    @ExportExcelField(title = "轴数", order = 4)
    private Integer axisNum;

    /**
     * 车速
     */
    @ExportExcelField(title = "车速", order = 5)
    private Double speed;

    /**
     * 车道
     */
    @ExportExcelField(title = "车道", order = 6)
    private Integer lane;

    /**
     * 设备唯一标识
     */
    @ExportExcelField(title = "设备唯一标识", order = 7)
    private String deviceId;

    /**
     * 拍照时间
     */
    private Date createTime;

    /**
     * 拍照时间
     */
    @ExportExcelField(title = "拍照时间", order = 8)
    private String createTimeShow;

    /**
     * 通过时间
     */
    private Date passTime;

    /**
     * 通过时间
     */
    @ExportExcelField(title = "通过时间", order = 9)
    private String passTimeShow;


    @ExportExcelField(title = "前向图片", order = 10)
    private String img;

    @ExportExcelField(title = "后向图片", order = 11)
    private String url;

    /**
     * 预检重量
     */
    @ExportExcelField(title = "预检重量", order = 12)
    private Double preAmt;

    /**
     * 检测站
     */
    @ExportExcelField(title = "检测站", order = 13)
    private String orgCode;

    /**
     * 车牌颜色（1蓝色2黄色）
     */
    @ExportExcelField(title = "车牌颜色码", order = 15)
    private Integer color;

    /**
     * 车牌颜色（1蓝色2黄色）
     */
    @ExportExcelField(title = "车牌颜色", order = 14)
    private String realColor;

}
