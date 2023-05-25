package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.mapper.AwsCheckDataMapper;
import cn.timelost.aws.service.AwsCheckDataService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public PageInfo<AwsCheckData> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AwsCheckData> historyList = checkDataMapper.selectList(new QueryWrapper<AwsCheckData>().orderByDesc("create_time"));
        return new PageInfo<>(historyList);
    }
}
