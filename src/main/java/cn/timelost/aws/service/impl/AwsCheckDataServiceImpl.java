package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsLed;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.mapper.AwsCheckDataMapper;
import cn.timelost.aws.service.AwsCheckDataService;
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
 * 精检信息记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsCheckDataServiceImpl extends ServiceImpl<AwsCheckDataMapper, AwsCheckData> implements AwsCheckDataService {

    @Autowired
    AwsCheckDataMapper checkDataMapper;

    @Override
    public PageInfo<AwsCheckData> findAll(int pageNum, int pageSize, String carNo, Integer lane, Double limitAmt, Integer axisNum, String startT, String endT) {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        QueryWrapper<AwsCheckData> qw = new QueryWrapper<>();
        if (!("").equals(carNo) && carNo != null)
            qw.like("car_no", carNo);
        if (lane != null && lane != 0)
            qw.eq("lane", lane);
        if (limitAmt != null && limitAmt != 0)
            qw.eq("limit_amt", limitAmt);
        if (axisNum != null && axisNum != 0)
            qw.eq("axis_num", axisNum);
        if (startT != null && !startT.equals("")) {
            try {
                qw.lambda().between(AwsCheckData::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        qw.orderByDesc("create_time");
        PageHelper.startPage(pageNum, pageSize);
        List<AwsCheckData> historyList = checkDataMapper.selectList(qw);
        return new PageInfo<>(historyList);
    }
}
