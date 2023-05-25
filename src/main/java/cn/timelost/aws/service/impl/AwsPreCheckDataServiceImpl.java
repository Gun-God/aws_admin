package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsCarType;
import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.entity.vo.NowPreCheckVo;
import cn.timelost.aws.mapper.AwsCarTypeMapper;
import cn.timelost.aws.mapper.AwsPreCheckDataMapper;
import cn.timelost.aws.service.AwsPreCheckDataService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 预检信息记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsPreCheckDataServiceImpl extends ServiceImpl<AwsPreCheckDataMapper, AwsPreCheckData> implements AwsPreCheckDataService {

    @Autowired
    AwsPreCheckDataMapper awsPreCheckDataMapper;

    @Autowired
    AwsCarTypeMapper carTypeMapper;

    @Override
    public ResultVo getNowPreCheckData() {
        List<NowPreCheckVo> nowPreCheckVoList = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            QueryWrapper<AwsPreCheckData> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("lane", i);
            queryWrapper.orderByDesc("create_time");
            queryWrapper.last("limit 1");
            AwsPreCheckData preCheckData = awsPreCheckDataMapper.selectOne(queryWrapper);

            if (preCheckData != null) {
                NowPreCheckVo vo1 = new NowPreCheckVo();
                vo1.setAxisNum(preCheckData.getAxisNum());
                vo1.setCarNo(preCheckData.getCarNo());
                vo1.setCreateTime(preCheckData.getCreateTime());
                vo1.setLimitAmt(preCheckData.getLimitAmt());
                vo1.setWeight(preCheckData.getWeight());
                Integer carType = preCheckData.getCarTypeId();
                if (carType!=null){
                    AwsCarType car = carTypeMapper.selectById(carType);
                    vo1.setHeight(car.getHeight());
                    vo1.setLength(car.getLength());
                    vo1.setWidth(car.getWidth());
                }

                vo1.setType(i);
                nowPreCheckVoList.add(vo1);
            }
        }


        return ResultVo.success(nowPreCheckVoList);
    }


}
