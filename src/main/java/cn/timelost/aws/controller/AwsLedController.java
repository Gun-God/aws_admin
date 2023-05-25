package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsLed;
import cn.timelost.aws.service.AwsLedService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * led显示记录表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/awsLed")
public class AwsLedController {


    @Autowired
    AwsLedService ledService;

    @RequestMapping(value = "/getLedList", method = RequestMethod.GET)
    public PageInfo<AwsLed> getLedList(@RequestParam(value = "page") Integer page,
                                                   @RequestParam(value = "size") Integer size){
        return ledService.findAll(page, size);
    }

}
