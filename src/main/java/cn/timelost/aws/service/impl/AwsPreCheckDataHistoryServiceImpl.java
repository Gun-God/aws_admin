package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
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
import java.util.function.Consumer;

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
    public List<AwsPreCheckDataHistory> findAll(int pageNum, int pageSize, String carNo, Integer[] lane, Double limitAmt, Integer[] axisNum, String startT, String endT,Double preAmtStart,Double preAmtEnd, String preNo,String orgCode,Integer color) {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        QueryWrapper<AwsPreCheckDataHistory> qw = new QueryWrapper<>();
//        String realCode= UserRealm.ORGCODE;
        int roleId=UserRealm.ROLEID;
        // QueryWrapper<AwsPreCheckData> qw2=new QueryWrapper<>();

        if (!("").equals(carNo) && carNo != null)
        {
            qw.like("car_no", carNo);
           // qw2.like("car_no", carNo);
        }

        if (lane != null && lane.length>0)
        {
//            qw.nested(new Consumer<QueryWrapper<AwsPreCheckDataHistory>>() {
//                @Override
//                public void accept(QueryWrapper<AwsPreCheckDataHistory> awsPreCheckDataHistoryQueryWrapper) {
//                    qw.eq("lane", lane[0]);
//                    if(lane.length>1)
//                    {
//                        for(int i=1;i<lane.length;i++)
//                        {
//                            qw.or().eq("lane", lane[i]);
//                        }
//                    }
//
//                }
//            });
            qw.in("lane", lane);
            //qw2.eq("lane", lane);
        }
        if (limitAmt != null && limitAmt != 0)
        {
            qw.eq("limit_amt", limitAmt);
            //qw2.eq("limit_amt", limitAmt);
        }

        if(preNo!=null &&!"".equals(preNo))
        {
            qw.eq("pre_no",preNo);
        }

        if (limitAmt != null && limitAmt != 0)
        {
            qw.eq("limit_amt", limitAmt);
            //qw2.eq("limit_amt", limitAmt);
        }

        if (axisNum != null && axisNum.length>0)
        {
            qw.in("axis_num",axisNum);

            //   qw2.eq("axis_num", axisNum);
        }

        if(color != null && color!=-1)
        {
            qw.eq("color", color);
        }

        if(preAmtStart != null && preAmtEnd!=null)
        {
            qw.between("pre_amt", preAmtStart, preAmtEnd);
        }

        if (startT != null && !startT.equals("")) {
            try {
                qw.lambda().between(AwsPreCheckDataHistory::getCreateTime, sm.parse(startT), sm.parse(endT));
               // qw2.lambda().between(AwsPreCheckData::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if(roleId==1 && orgCode!=null && !("".equals(orgCode)))
        {
            qw.eq("org_code",orgCode);
        }
        else{
            String oCode=UserRealm.ORGCODE;
            qw.eq("org_code",oCode);
        }

//        if(orgCode!=null && !("".equals(orgCode)) && roleId==1 )//只有超级管理员才可以选择不同的org
//        {
//            qw.eq("org_code",orgCode);
//        }

        qw.orderByDesc("create_time");
        //qw2.orderByDesc("create_time");
        if(pageSize!=-1)
        {
            PageHelper.startPage(pageNum, pageSize);
            List<AwsPreCheckDataHistory> historyList = preCheckDataHistoryMapper.selectList(qw);
            return historyList;
        }
        else{//-1表示不分页
//            PageHelper.startPage(pageNum, pageSize);
            List<AwsPreCheckDataHistory> historyList = preCheckDataHistoryMapper.selectList(qw);

            return historyList;
        }
//        return null;
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

//        return new PageInfo<>(historyList);

    }
}
