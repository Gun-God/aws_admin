package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.mapper.AwsPreCheckDataHistoryMapper;
import cn.timelost.aws.mapper.AwsPreCheckDataMapper;
import cn.timelost.aws.service.AwsPreCheckDataHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
    @Autowired
    AwsPreCheckDataMapper   preCheckDataMapper;
    @Override
    public PageInfo<AwsPreCheckDataHistory> findAll(int pageNum, int pageSize, String carNo, Integer lane, Double limitAmt, Integer axisNum, String startT, String endT) {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        QueryWrapper<AwsPreCheckDataHistory> qw = new QueryWrapper<>();
       // QueryWrapper<AwsPreCheckData> qw2=new QueryWrapper<>();

        if (!("").equals(carNo) && carNo != null)
        {
            qw.like("car_no", carNo);
           // qw2.like("car_no", carNo);
        }

        if (lane != null && lane != 0)
        {
            qw.eq("lane", lane);
            //qw2.eq("lane", lane);
        }
        if (limitAmt != null && limitAmt != 0)
        {
            qw.eq("limit_amt", limitAmt);
            //qw2.eq("limit_amt", limitAmt);
        }
        if (axisNum != null && axisNum != 0)
        {
            qw.eq("axis_num", axisNum);
           // qw2.eq("axis_num", axisNum);

        }

        if (limitAmt != null && limitAmt != 0)
        {
            qw.eq("limit_amt", limitAmt);
            //qw2.eq("limit_amt", limitAmt);
        }

        if (axisNum != null && axisNum != 0)
        {
            qw.eq("axis_num", axisNum);
         //   qw2.eq("axis_num", axisNum);
        }

        if (startT != null && !startT.equals("")) {
            try {
                qw.lambda().between(AwsPreCheckDataHistory::getCreateTime, sm.parse(startT), sm.parse(endT));
               // qw2.lambda().between(AwsPreCheckData::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        qw.orderByDesc("create_time");
        //qw2.orderByDesc("create_time");
        PageHelper.startPage(pageNum, pageSize);
        List<AwsPreCheckDataHistory> historyList = preCheckDataHistoryMapper.selectList(qw);
      ///  List<AwsPreCheckData>  perCheckList = preCheckDataMapper.selectList(qw2);
//        for(AwsPreCheckData pc:perCheckList)
//        {
//            AwsPreCheckDataHistory pch=new AwsPreCheckDataHistory();
//            pch.setAxisNum(pc.getAxisNum());
//            pch.setCarNo(pc.getCarNo());
//            pch.setCreateTime(pc.getCreateTime());
//            pch.setSpeed(pc.getSpeed());
//            pch.setCarTypeId(pc.getCarTypeId());
//            pch.setLane(pc.getLane());
//            pch.setIsShow(pc.getIsShow());
//            pch.setLimitAmt(pc.getLimitAmt());
//            pch.setPreAmt(pc.getPreAmt());
//            pch.setWeight(pc.getWeight());
//            historyList.add(pch);
//
//        }

        return new PageInfo<>(historyList);
    }
}
