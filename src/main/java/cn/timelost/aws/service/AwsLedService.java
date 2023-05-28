package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsLed;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * led显示记录表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsLedService extends IService<AwsLed> {

    PageInfo<AwsLed> findAll(int pageNum, int pageSize, String carNo, String startT, String endT);

}
