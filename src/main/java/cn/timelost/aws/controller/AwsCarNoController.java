package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsCarNo;
import cn.timelost.aws.service.AwsCarNoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 车牌抓拍记录表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/carNo")
public class AwsCarNoController {

    @Autowired
    AwsCarNoService noService;


    @RequestMapping(value = "/getCarNoDataList", method = RequestMethod.GET)
    public PageInfo<AwsCarNo> getCarNoDataList(@RequestParam(value = "page") Integer page,
                                               @RequestParam(value = "size") Integer size,
                                               @RequestParam(value = "carNo", required = false) String carNo,
                                               @RequestParam(value = "startT", required = false) String startT,
                                               @RequestParam(value = "endT", required = false) String endT,
                                               @RequestParam(value = "orgCode", required = false) String orgCode,
                                               @RequestParam(value = "color", required = false) Integer color
                                               ) {
        return noService.findAll(page, size, carNo, startT, endT,orgCode,color);
    }

}
