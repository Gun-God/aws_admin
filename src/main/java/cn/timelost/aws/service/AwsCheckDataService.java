package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsCheckData;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 精检信息记录表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsCheckDataService extends IService<AwsCheckData> {

    PageInfo<AwsCheckData> findAll(int pageNum, int pageSize, String carNo, Integer lane, Double limitAmt, Integer axisNum, String startT, String endT);


}
