package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsScan;
import cn.timelost.aws.mapper.AwsScanMapper;
import cn.timelost.aws.service.AwsScanService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 设备信息表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsScanServiceImpl extends ServiceImpl<AwsScanMapper, AwsScan> implements AwsScanService {

    @Override
    public PageInfo<AwsScan> findList(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public ResultVo deleteById(int id) {
        return null;
    }

    @Override
    public ResultVo insert(AwsScan scan) {
        return null;
    }

    @Override
    public ResultVo updateUserById(AwsScan scan) {
        return null;
    }
}
