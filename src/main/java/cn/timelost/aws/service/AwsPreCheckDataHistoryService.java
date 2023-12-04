package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>
 * 预检信息记录历史表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsPreCheckDataHistoryService extends IService<AwsPreCheckDataHistory> {

    List<AwsPreCheckDataHistory> findAll(int pageNum, int pageSize, String carNo, Integer[] lane, Double limitAmt, Integer[] axisNum, String startT, String endT, Double preAmtStart, Double preAmtEnd, String preNo, String orgCode, Integer color);


}
