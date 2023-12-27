package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsScan;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsScanMapper;
import cn.timelost.aws.service.AwsScanService;
import cn.timelost.aws.service.AwsUserLogService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    @Autowired
    AwsUserLogService logService;

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
        logService.InsertUserLog("删除设备:"+scan.getCode(),1);
        return ResultVo.success();
    }

    @Override
    public ResultVo insert(AwsScan scan) {
        int c = scanMapper.selectCount(new QueryWrapper<AwsScan>().eq("code", scan.getCode()));
        if (c != 0)
            return ResultVo.fail("设备编号已存在");

        String operName=UserRealm.USERNAME;
        scan.setOperName(operName);
        scan.setId(null);
        scan.setState(1);
        scan.setCreateTime(new Date());
        if (scanMapper.insert(scan) == 0)
            return ResultVo.fail(ResultEnum.ERROR);
        logService.InsertUserLog("添加设备",1);
        return ResultVo.success();
    }

    @Override
    public ResultVo updateScanById(AwsScan scan) {
        if (scan == null)
            return ResultVo.fail("设备不存在");
//        if (scanMapper.updateById(scan) == 0)
//            return ResultVo.fail(ResultEnum.ERROR);

        if(0==scanMapper.update(scan,new QueryWrapper<AwsScan>().eq("code",scan.getCode())))
        {
            return ResultVo.fail(ResultEnum.ERROR);
        }

        logService.InsertUserLog("修改设备:"+scan.getCode(),1);
        return ResultVo.success();
    }

    @Override
    public ResultVo selectAllCamera() {
        QueryWrapper<AwsScan> qw=new QueryWrapper<>();
        qw.lambda().eq(AwsScan::getType,3).ne(AwsScan::getState,0);
        List<AwsScan> list=scanMapper.selectList(qw);
        return ResultVo.success(list);
    }

    @Override
    public ResultVo selectAllPreviewDevice() {
        //得到type为3和4的预览设备 （抓拍摄像机和球机）
        Integer[] types={3,4};
        QueryWrapper<AwsScan> qw=new QueryWrapper<>();
        qw.lambda().in(AwsScan::getType,types).ne(AwsScan::getState,0);
        List<AwsScan> list=scanMapper.selectList(qw);
        return ResultVo.success(list);
    }
}
