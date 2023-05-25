package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 预检信息记录表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsPreCheckDataService extends IService<AwsPreCheckData> {

    ResultVo getNowPreCheckData();







}
