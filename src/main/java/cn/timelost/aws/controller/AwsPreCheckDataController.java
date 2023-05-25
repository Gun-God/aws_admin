package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.mapper.AwsPreCheckDataMapper;
import cn.timelost.aws.service.AwsPreCheckDataService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 预检信息记录表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/preCheck")
public class AwsPreCheckDataController {

    @Autowired
    AwsPreCheckDataMapper preCheckDataMapper;

    @Autowired
    AwsPreCheckDataService preCheckDataService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public ResultVo getPreCheckDataNewList(@RequestParam(value = "orgCode") String orgCode){
       List<AwsPreCheckData> dataList=preCheckDataMapper.selectList(new QueryWrapper<AwsPreCheckData>().eq("org_code",orgCode).orderByDesc("create_time").last("limit 30"));
        return ResultVo.success(dataList);
    }

    @RequestMapping(value = "/getNowPreCheckData", method = RequestMethod.GET)
    public ResultVo getNowPreCheckData(){
        return preCheckDataService.getNowPreCheckData();
    }








}
