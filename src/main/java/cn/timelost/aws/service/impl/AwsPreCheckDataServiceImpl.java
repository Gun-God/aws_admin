package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.*;
import cn.timelost.aws.entity.vo.NowPreCheckVo;
import cn.timelost.aws.mapper.*;
import cn.timelost.aws.service.AwsPreCheckDataService;
import cn.timelost.aws.utils.DateUtil;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 预检信息记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @version 1.0
 * @description 预检信息记录表 服务实现类
 * @since 2023-05-15
 */
@Service
public class AwsPreCheckDataServiceImpl extends ServiceImpl<AwsPreCheckDataMapper, AwsPreCheckData> implements AwsPreCheckDataService {

    @Autowired
    AwsPreCheckDataMapper awsPreCheckDataMapper;

    @Autowired
    AwsPreCheckDataHistoryMapper historyMapper;

    @Autowired
    AwsCarTypeMapper carTypeMapper;

    @Autowired
    AwsSystemSettingMapper systemSettingMapper;

    @Autowired
    AwsSystemLogMapper logMapper;

    @Autowired
    AwsUserMapper userMapper;



    @Override
    public ResultVo getNowPreCheckData() {
        String orgCode=UserRealm.ORGCODE;
        List<NowPreCheckVo> nowPreCheckVoList = new ArrayList<>();

        for (int i = 2; i <= 4; i++) {
            QueryWrapper<AwsPreCheckData> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("lane", i);
            if (orgCode!=null &&(!orgCode.equals("9999")) )
            {
                queryWrapper.eq("org_code",orgCode);
            }

            queryWrapper.orderByDesc("create_time");
            queryWrapper.last("limit 1");
            AwsPreCheckData preCheckData = awsPreCheckDataMapper.selectOne(queryWrapper);
            if (preCheckData != null) {
                NowPreCheckVo vo1 = new NowPreCheckVo();
                vo1.setAxisNum(preCheckData.getAxisNum());
                vo1.setCarNo(preCheckData.getCarNo());
                vo1.setCreateTime(preCheckData.getCreateTime());
                vo1.setLimitAmt(preCheckData.getLimitAmt());
                vo1.setWeight(preCheckData.getPreAmt());
                vo1.setImg(preCheckData.getImg());

                Integer carType = preCheckData.getCarTypeId();

                if (carType != null) {
                    AwsCarType car = carTypeMapper.selectById(carType);
                    if(car!=null) {
                        vo1.setLimitAmt(car.getLimitAmt());
                        vo1.setHeight(car.getHeight());
                        vo1.setLength(car.getLength());
                        vo1.setWidth(car.getWidth());
                    }
                }
                vo1.setType(i);
                vo1.setColor(preCheckData.getColor());
                nowPreCheckVoList.add(vo1);
            }
        }
//        Date d=nowPreCheckVoList.get(0).getCreateTime();
//        Date d2=nowPreCheckVoList.get(1).getCreateTime();
//        if (d.before(d2))
//            nowPreCheckVoList.remove(0);
//        else {
//            nowPreCheckVoList.remove(1);
//        }


        return ResultVo.success(nowPreCheckVoList);
    }

    @Override
    public void transferPreData() {
        int h = 0;
        DateUtil.getCurrentDateStr("yyyy-MM-dd");
        AwsSystemSetting setting = systemSettingMapper.selectOne(new QueryWrapper<AwsSystemSetting>().eq("setting", "PRE_DATA_TIME"));
        if (setting != null)
            h = Integer.parseInt(setting.getMsg());
        System.err.println(DateUtil.getDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
        Date date = DateUtil.beforeHourToNowDate(new Date(), h);
        System.err.println(DateUtil.getDate(date, "yyyy-MM-dd HH:mm:ss"));
        QueryWrapper<AwsPreCheckData> qw = new QueryWrapper<>();
        qw.lambda().le(AwsPreCheckData::getCreateTime, date);
        List<AwsPreCheckData> dataList = awsPreCheckDataMapper.selectList(qw);
        // int size=dataList.size();
        int count = 0;
        for (AwsPreCheckData apc : dataList) {
            AwsPreCheckDataHistory history = new AwsPreCheckDataHistory();
            BeanUtils.copyProperties(apc, history);
            history.setId(null);
//            if (historyMapper.insert(history) != 0) {
                count++;
                awsPreCheckDataMapper.deleteById(apc.getId());
        //    }
        }
        AwsSystemLog log = new AwsSystemLog();
        log.setContent("定时任务:预检数据转到历史表,已转入" + count + "条");
        log.setCreateTime(new Date());
        logMapper.insert(log);
        // System.err.println("已全部转入");
    }

    @Override
    public void transferPreDataTemp() {

    }

    @Override
    public int getCarCountToday() {
        QueryWrapper<AwsPreCheckData> qw = new QueryWrapper<>();
        String orgCode=UserRealm.ORGCODE;
        if(!orgCode.equals("9999"))
            qw.lambda().eq(AwsPreCheckData::getOrgCode, orgCode);
        String d = DateUtil.formatDate(new Date(), "yyyy-MM-dd");
        qw.eq("to_char(create_time,'yyyy-MM-dd')", d);
        int count;
        count = awsPreCheckDataMapper.selectCount(qw);
        return count;
    }

    @Override
    public ResultVo getCarOverLoadToday() {
        String orgCode=UserRealm.ORGCODE;
        int total = getCarCountToday();
        int limitC = 0, limitB = 0;
        double limitCPer = 0, limitBPer = 0;
        String d = DateUtil.formatDate(new Date(), "yyyy-MM-dd");
        if (total != 0) {
            QueryWrapper<AwsPreCheckData> qw = new QueryWrapper<>();

            if(orgCode!=null && (!orgCode.equals("9999")) )
                qw.lambda().eq(AwsPreCheckData::getOrgCode, orgCode);
            qw.eq("to_char(create_time,'yyyy-MM-dd')", d);
            // qw.lambda().eq(AwsPreCheckData::getCreateTime, new Date());
            qw.apply("pre_amt > limit_amt");
            List<AwsPreCheckData> list = awsPreCheckDataMapper.selectList(qw);

            for (AwsPreCheckData pre : list) {
                double preAmt = pre.getPreAmt();
                double limitAmt = pre.getLimitAmt();
                double p = (preAmt - limitAmt) / limitAmt;
                if (p > 0.3)
                    limitC++;
            }
            QueryWrapper<AwsPreCheckData> qw1 = new QueryWrapper<>();
            if(orgCode!=null && (!orgCode.equals("9999")) ) {
                qw1.lambda().eq(AwsPreCheckData::getOrgCode, orgCode);
            }
            qw1.gt("pre_amt", 100).eq("to_char(create_time,'yyyy-MM-dd')", d);
            limitB = awsPreCheckDataMapper.selectCount(qw1);
//            limitB = awsPreCheckDataMapper.selectCount(new QueryWrapper<AwsPreCheckData>().gt("pre_amt", 100).eq("to_char(create_time,'yyyy-MM-dd')", d));
            BigDecimal b1 = BigDecimal.valueOf(((double) limitC / total) * 100);
            BigDecimal b2 = BigDecimal.valueOf(((double) limitB / total) * 100);
            limitCPer = b1.setScale(2, RoundingMode.HALF_UP).doubleValue();
            limitBPer = b2.setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        Object[] arr = new Object[4];
        arr[0] = limitC;
        arr[1] = limitCPer;
        arr[2] = limitB;
        arr[3] = limitBPer;
        return ResultVo.success(arr);
    }

    @Override
    public ResultVo getCarCountLast24H() {
        List<Date[]> dates = DateUtil.before24HByNowDate();
        List<Integer> carCount = new ArrayList<>();
        List<String> xAxis = new ArrayList<>();
        String orgCode=UserRealm.ORGCODE;

        String axis;
        for (int i = 0; i < dates.size(); i++) {
            Date[] da = dates.get(i);
            QueryWrapper<AwsPreCheckData> qw = new QueryWrapper<>();
            if(orgCode!=null && (!orgCode.equals("9999")) )
            {
                qw.lambda().between(AwsPreCheckData::getCreateTime, da[0], da[1]).eq(AwsPreCheckData::getOrgCode, orgCode);
            }
            else{
                qw.lambda().between(AwsPreCheckData::getCreateTime, da[0], da[1]);
            }

            int count = awsPreCheckDataMapper.selectCount(qw);
            carCount.add(count);
            if (i == dates.size() - 1)
                axis = "现在";
            else
                axis = DateUtil.formatDate(da[1], "HH");
            xAxis.add(axis);
        }
        List[] lists = new List[2];
        lists[0] = carCount;
        lists[1] = xAxis;
        return ResultVo.success(lists);
    }

    @Data
    private static class CarTypeVo {
        private Integer value;
        private String name;
    }

    @Override
    public ResultVo getCarTypeCountCurrent() {
        String orgCode=UserRealm.ORGCODE;
        String d = DateUtil.formatDate(new Date(), "yyyy-MM-dd");
        List<CarTypeVo> carTypeVos = new ArrayList<>();
//        QueryWrapper<AwsCarType> qw = new QueryWrapper<>();
//        qw.lambda().eq(AwsCarType::getState, 1);
//        // qw.lambda().lt(AwsCarType::getAxisNum, 6);
//        qw.orderByAsc("axis_num");
//        List<AwsCarType> list = carTypeMapper.selectList(qw);
        int axisCount = 0;
        int axisCount1 = 0;
        String name = "6轴及以上";
        String name1 = "其他";
        for (int i = 0; i <= 8; i++) {
            QueryWrapper<AwsPreCheckData> qw1 = new QueryWrapper<>();
            if(orgCode!=null && (!orgCode.equals("9999")) )
            {
                qw1.lambda().eq(AwsPreCheckData::getAxisNum, i).eq(AwsPreCheckData::getOrgCode, orgCode);
            }
            else{
                qw1.lambda().eq(AwsPreCheckData::getAxisNum, i);
            }


            qw1.eq("to_char(create_time,'yyyy-MM-dd')", d);
            int count = awsPreCheckDataMapper.selectCount(qw1);
            if (i >= 2 && i < 6) {
                CarTypeVo vo = new CarTypeVo();
                vo.setName(i + "轴车");
                vo.setValue(count);
                carTypeVos.add(vo);
            } else if (i >= 6) {
                axisCount += count;
            } else {
                axisCount1 += count;
            }
        }
        CarTypeVo vo = new CarTypeVo();
        vo.setName(name);
        vo.setValue(axisCount);
        carTypeVos.add(vo);
        CarTypeVo vo1 = new CarTypeVo();
        vo1.setName(name1);
        vo1.setValue(axisCount1);
        carTypeVos.add(vo1);
        return ResultVo.success(carTypeVos);
    }
}
