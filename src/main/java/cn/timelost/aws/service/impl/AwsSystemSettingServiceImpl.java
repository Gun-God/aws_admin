package cn.timelost.aws.service.impl;

import cn.timelost.aws.entity.AwsSystemSetting;
import cn.timelost.aws.entity.vo.AwsSystemSettingForm;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.exception.BaseException;
import cn.timelost.aws.mapper.AwsSystemSettingMapper;
import cn.timelost.aws.service.AwsSystemSettingService;
import cn.timelost.aws.service.AwsUserLogService;
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

    @Autowired
    AwsUserLogService logService;

    @Override
    public ResultVo findAll() {
        List<AwsSystemSetting> settings=systemSettingMapper.selectList(null);
        return ResultVo.success(settings);
    }

    @Override
//    @CacheEvict(allEntries = true)
    public void insert(AwsSystemSetting setting) {

        if (systemSettingMapper.insert(setting)==0)
            return;;
        logService.InsertUserLog("创建系统设定参数",1);

    }

    @Override
//    @CacheEvict(allEntries = true)
    public void deleteById(Integer id) {
        AwsSystemSetting setting=systemSettingMapper.selectById(id);
        if (ObjectUtils.isEmpty(setting)) {
            throw new BaseException(ResultEnum.SETTING_NOT_EXIST);
        }
        systemSettingMapper.deleteById(id);
        logService.InsertUserLog("删除系统设定参数:"+setting.getSetting(),1);

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
        logService.InsertUserLog("修改系统设定参数:"+setting.getSetting(),1);



    }
}
