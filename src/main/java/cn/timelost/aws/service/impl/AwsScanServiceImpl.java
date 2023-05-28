package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsScan;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsScanMapper;
import cn.timelost.aws.service.AwsScanService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Autowired
    AwsScanMapper scanMapper;

    @Override
    public PageInfo<AwsScan> findList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AwsScan> awsScans = scanMapper.selectAll();
        return new PageInfo<>(awsScans);
    }

    @Override
    public ResultVo deleteById(int id) {
        AwsScan scan = scanMapper.selectById(id);
        if (scan == null)
            return ResultVo.fail("设备不存在");
        scan.setState(0);
        if (scanMapper.updateById(scan) == 0)
            return ResultVo.fail(ResultEnum.ERROR);
        return ResultVo.success();
    }

    @Override
    public ResultVo insert(AwsScan scan) {
        int c = scanMapper.selectCount(new QueryWrapper<AwsScan>().eq("code", scan.getCode()));
        if (c != 0)
            return ResultVo.fail("设备编号已存在");
        scan.setId(null);
        if (scanMapper.insert(scan) == 0)
            return ResultVo.fail(ResultEnum.ERROR);
        return ResultVo.success();
    }

    @Override
    public ResultVo updateScanById(AwsScan scan) {
        if (scan == null)
            return ResultVo.fail("设备不存在");
        if (scanMapper.updateById(scan) == 0)
            return ResultVo.fail(ResultEnum.ERROR);
        return ResultVo.success();
    }
}
