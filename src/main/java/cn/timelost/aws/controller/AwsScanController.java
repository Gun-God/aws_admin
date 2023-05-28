package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsScan;
import cn.timelost.aws.service.AwsScanService;
import cn.timelost.aws.vo.ResultVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 设备信息表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/scan")
public class AwsScanController {

    @Autowired
    AwsScanService scanService;


    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public PageInfo<AwsScan> getScanDataList(@RequestParam(value = "page") Integer page,
                                             @RequestParam(value = "size") Integer size) {
        return scanService.findList(page, size);
    }


    @RequestMapping(value = "/insertScan", method = RequestMethod.POST)
    ////@RequiresRoles("admin")
    public ResultVo add(@RequestBody AwsScan scan) {
        return scanService.insert(scan);
    }


    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    ////@RequiresRoles("admin")
    public ResultVo delete(@RequestParam("id") Integer id) {
        return scanService.deleteById(id);
    }


    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    //@RequiresRoles("admin")
    public ResultVo update(@RequestBody AwsScan scan) {
        return scanService.updateScanById(scan);
    }


}
