package cn.timelost.aws.controller;


import cn.timelost.aws.entity.vo.AwsSystemSettingForm;
import cn.timelost.aws.service.AwsSystemSettingService;
import cn.timelost.aws.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 系统参数设定表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/systemSetting")
public class AwsSystemSettingController {

    @Autowired
    AwsSystemSettingService systemSettingService;


    @RequestMapping(value="/getList",method = RequestMethod.GET)
    public ResultVo getSettingsList(){
        return systemSettingService.findAll();
    }


    @RequestMapping(value="/deleteById",method = RequestMethod.GET)
    //@RequiresRoles("admin")
    public ResultVo delete(@RequestParam("id") Integer id) {
        systemSettingService.deleteById(id);
        return ResultVo.success();
    }





    @RequestMapping(value="/updateById",method = RequestMethod.POST)
    public ResultVo updateById(@RequestBody AwsSystemSettingForm department) {
        systemSettingService.updateById(department);
        return ResultVo.success();
    }


    @RequestMapping(value="/getSystemName",method = RequestMethod.GET)
    public ResultVo getSysName() {
        String name=systemSettingService.getSystemName();
        return ResultVo.success(name);
    }

}
