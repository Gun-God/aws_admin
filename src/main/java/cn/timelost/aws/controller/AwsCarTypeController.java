package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsCarType;
import cn.timelost.aws.mapper.AwsCarTypeMapper;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 车辆类型表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/awsCarType")
public class AwsCarTypeController {

    @Autowired
    AwsCarTypeMapper carTypeMapper;




    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public ResultVo getAwsCarTypeList(){
        List<AwsCarType> carTypeList=carTypeMapper.selectList(new QueryWrapper<AwsCarType>().eq("state",1));
        return ResultVo.success(carTypeList);
    }



}
