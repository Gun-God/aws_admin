package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsUserLog;
import cn.timelost.aws.service.AwsUserLogService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户操作记录表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/user")
public class AwsUserLogController {

    @Autowired
    AwsUserLogService logService;

    @RequestMapping(value = "/getUserLog", method = RequestMethod.GET)
    public PageInfo<AwsUserLog> selectAll(@RequestParam(value = "page") Integer page,
                                          @RequestParam(value = "size") Integer size){
       return logService.findAll(page,size);
    }

}
