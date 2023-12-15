package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsSystemSetting;
import cn.timelost.aws.entity.vo.AwsSystemSettingForm;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统参数设定表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsSystemSettingService extends IService<AwsSystemSetting> {


    ResultVo findAll();
    void insert(AwsSystemSetting setting);

    void deleteById(Integer id);

    void updateById(AwsSystemSettingForm form);

    String getSystemName();

}
