package cn.timelost.aws.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author :hyw
 * @version 1.0
 * @date : 2023/05/16 19:10
 */
@Data
public class NowPreCheckVo {
    public String carNo;
    public Date createTime;
    public Double weight;
    public Double limitAmt;
    public Integer axisNum;
    public Double length=0.0;
    public Double width=0.0;
    public Double height=0.0;
    public Integer type;
    public Integer color;

}
