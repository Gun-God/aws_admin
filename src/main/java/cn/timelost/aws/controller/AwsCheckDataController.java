package cn.timelost.aws.controller;


import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.mapper.AwsCheckDataMapper;
import cn.timelost.aws.service.AwsCheckDataService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 精检信息记录表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/checkData")
public class AwsCheckDataController {

    @Autowired
    AwsCheckDataService checkDataService;
    @Autowired
    AwsCheckDataMapper checkDataMapper;



    @RequestMapping(value = "/getCheckDataList", method = RequestMethod.GET)
    public PageInfo<AwsCheckData> getCheckDataList(@RequestParam(value = "page") Integer page,
                                                   @RequestParam(value = "size") Integer size,
                                                   @RequestParam(value = "carNo", required = false) String carNo,
                                                   @RequestParam(value = "lane", required = false) Integer lane,
                                                   @RequestParam(value = "amtS", required = false) Integer amtS,
                                                   @RequestParam(value = "amtE", required = false) Integer amtE,
                                                   @RequestParam(value = "limitAmt", required = false) Double limitAmt,
                                                   @RequestParam(value = "axisNum", required = false) Integer axisNum,
                                                   @RequestParam(value = "startT", required = false) String startT,
                                                   @RequestParam(value = "endT", required = false) String endT) {
        return checkDataService.findAll(page, size, carNo, lane, limitAmt, axisNum, startT, endT);
    }


    @RequestMapping(value = "/addCheck", method = RequestMethod.POST)
    ////@RequiresRoles("admin")
    public ResultVo add(@RequestBody AwsCheckData cks) {

        System.out.println(cks);

        return checkDataService.insert(cks);
    }


    @RequestMapping(value = "/getCheckList", method = RequestMethod.GET)
    public ResultVo getPreCheckDataNewList(){
        //String orgCode= UserRealm.ORGCODE;
        List<AwsCheckData> dataList=null;


            dataList=checkDataMapper.selectList(new QueryWrapper<AwsCheckData>().orderByDesc("check_time").last("limit 30"));

        return ResultVo.success(dataList);
    }

}
