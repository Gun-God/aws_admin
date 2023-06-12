package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsCarNo;
import cn.timelost.aws.mapper.AwsCarNoMapper;
import cn.timelost.aws.service.AwsCarNoService;
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
 * 车牌抓拍记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsCarNoServiceImpl extends ServiceImpl<AwsCarNoMapper, AwsCarNo> implements AwsCarNoService {

    @Autowired
    AwsCarNoMapper carNoMapper;

    @Override
    public PageInfo<AwsCarNo> findAll(int pageNum, int pageSize, String carNo, String startT, String endT) {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        QueryWrapper<AwsCarNo> qw = new QueryWrapper<>();
        if (!("").equals(carNo) && carNo != null)
            qw.like("car_no", carNo);
        if (startT != null && !startT.equals("")) {
            try {
                qw.lambda().between(AwsCarNo::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        qw.orderByDesc("create_time");
        PageHelper.startPage(pageNum, pageSize);
        List<AwsCarNo> awsCarNos = carNoMapper.selectList(qw);
        return new PageInfo<>(awsCarNos);
    }
}
