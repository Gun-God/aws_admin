package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsCarNo;
import cn.timelost.aws.entity.AwsCheckData;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 车牌抓拍记录表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsCarNoService extends IService<AwsCarNo> {

    PageInfo<AwsCarNo> findAll(int pageNum, int pageSize, String carNo, String startT, String endT);


}
