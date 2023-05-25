package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsScan;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 设备信息表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsScanService extends IService<AwsScan> {

    PageInfo<AwsScan> findList(int pageNum, int pageSize);

    ResultVo deleteById(int id);

    ResultVo insert(AwsScan scan);

    ResultVo updateUserById(AwsScan scan);


}
