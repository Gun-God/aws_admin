package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.mapper.AwsPreCheckDataHistoryMapper;
import cn.timelost.aws.service.AwsPreCheckDataHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 预检信息记录历史表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsPreCheckDataHistoryServiceImpl extends ServiceImpl<AwsPreCheckDataHistoryMapper, AwsPreCheckDataHistory> implements AwsPreCheckDataHistoryService {


    @Autowired
    AwsPreCheckDataHistoryMapper preCheckDataHistoryMapper;

    @Override
    public PageInfo<AwsPreCheckDataHistory> findAll(int pageNum, int pageSize,String carNo,Integer lane,Double limitAmt,Integer axisNum){

        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<AwsPreCheckDataHistory> qw=new QueryWrapper<>();
        if (!("").equals(carNo)&&carNo!=null)
            qw.like("car_no",carNo);
        if (lane!=null&&lane!=0)
            qw.eq("lane",lane);
        if (limitAmt!=null&&limitAmt!=0)
            qw.eq("limit_amt",limitAmt);
        if (axisNum!=null&&axisNum!=0)
            qw.eq("axis_num",axisNum);
        qw.orderByDesc("create_time");
        List<AwsPreCheckDataHistory> historyList = preCheckDataHistoryMapper.selectList(qw);
        return new PageInfo<>(historyList);
    }
}
