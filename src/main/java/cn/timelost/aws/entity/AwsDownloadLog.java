package cn.timelost.aws.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

public class AwsDownloadLog  implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 是否下载完成0未完成 1完成
     */
    private Integer state;

    /**
     * 百分比
     */
    private Double percent;

    /**
     * 操作员
     */
    String oper;

    /**
     * 操作时间
     */
    Date oper_time;

    Integer userId;


    /**
     *  orgcode
     */
    String orgCode;


    /**
     *  文件内容
     */
    String content;


    /**
     * 下载路径
     */
    String url;

    /**
     * 文件名
     */
    String fileName;

    /**
     * 0 excel 1 img
     */
    int type;

}
