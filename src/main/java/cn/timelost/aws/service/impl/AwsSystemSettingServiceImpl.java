package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsSystemSetting;
import cn.timelost.aws.entity.vo.AwsSystemSettingForm;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.exception.BaseException;
import cn.timelost.aws.mapper.AwsSystemSettingMapper;
import cn.timelost.aws.service.AwsSystemSettingService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * <p>
 * 系统参数设定表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsSystemSettingServiceImpl extends ServiceImpl<AwsSystemSettingMapper, AwsSystemSetting> implements AwsSystemSettingService {

    @Autowired
    AwsSystemSettingMapper systemSettingMapper;

    @Override
    public ResultVo findAll() {
        List<AwsSystemSetting> settings=systemSettingMapper.selectList(null);
        return ResultVo.success(settings);
    }

    @Override
//    @CacheEvict(allEntries = true)
    public void insert(AwsSystemSetting setting) {
        systemSettingMapper.insert(setting);
    }

    @Override
//    @CacheEvict(allEntries = true)
    public void deleteById(Integer id) {
        AwsSystemSetting setting=systemSettingMapper.selectById(id);
        if (ObjectUtils.isEmpty(setting)) {
            throw new BaseException(ResultEnum.SETTING_NOT_EXIST);
        }
        systemSettingMapper.deleteById(id);


    }

    @Override
  //  @CacheEvict(allEntries = true)
    public void updateById(AwsSystemSettingForm form) {
        AwsSystemSetting setting=systemSettingMapper.selectById(form.getId());
        if (ObjectUtils.isEmpty(setting)) {
            throw new BaseException(ResultEnum.SETTING_NOT_EXIST);
        }
        BeanUtils.copyProperties(form, setting);
        systemSettingMapper.updateById(setting);



    }
}
