package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsLed;
import cn.timelost.aws.mapper.AwsLedMapper;
import cn.timelost.aws.service.AwsLedService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * led显示记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsLedServiceImpl extends ServiceImpl<AwsLedMapper, AwsLed> implements AwsLedService {

    @Autowired
    AwsLedMapper ledMapper;

    @Override
    public PageInfo<AwsLed> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AwsLed> ledList=ledMapper.selectList(new QueryWrapper<AwsLed>().orderByDesc("create_time"));
        return new PageInfo<>(ledList);
    }
}
