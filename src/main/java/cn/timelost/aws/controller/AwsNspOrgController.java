package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.service.AwsNspOrgService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 检测站信息表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/org")
public class AwsNspOrgController {

    @Autowired
    AwsNspOrgMapper orgMapper;

    @Autowired
    AwsNspOrgService orgService;

    @RequestMapping(value = "/getOrgInfoByCode", method = RequestMethod.GET)
    public ResultVo getOrgInfoByCode(@RequestParam(value = "orgCode") String orgCode){
        AwsNspOrg org=orgMapper.selectOne(new QueryWrapper<AwsNspOrg>().eq("code",orgCode));
        return ResultVo.success(org);
    }


    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public PageInfo<AwsNspOrg> getOrgDataList(@RequestParam(value = "page") Integer page,
                                             @RequestParam(value = "size") Integer size){
        return orgService.findList(page, size);
    }



    @RequestMapping(value = "/insertOrg", method = RequestMethod.POST)
    ////@RequiresRoles("admin")
    public ResultVo add(@RequestBody AwsNspOrg org) {
        return  orgService.insert(org);
    }


    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    ////@RequiresRoles("admin")
    public ResultVo delete(@RequestParam("id") Integer id) {
        return orgService.deleteById(id);
    }



    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    //@RequiresRoles("admin")
    public ResultVo update( @RequestBody AwsNspOrg org) {
        return orgService.updateUserById(org);
    }

    @RequestMapping(value = "/selectAllOrg", method = RequestMethod.GET)
    ////@RequiresRoles("admin")
    public ResultVo selectAllOrg() {
        return orgService.selectAllOrg();
    }


}
