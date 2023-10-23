package cn.timelost.aws.controller;


import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.service.AwsPreCheckDataHistoryService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 预检信息记录历史表 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/preCheck")
public class AwsPreCheckDataHistoryController {

    @Autowired
    AwsPreCheckDataHistoryService preCheckDataHistoryService;


    @RequestMapping(value = "/getHistoryList", method = RequestMethod.GET)
    public PageInfo<AwsPreCheckDataHistory> getPreCheckDataHistoryList(@RequestParam(value = "page") Integer page,
                                                                       @RequestParam(value = "size") Integer size,
                                                                       @RequestParam(value = "carNo", required = false) String carNo,
                                                                       @RequestParam(value = "lane", required = false) Integer lane,
                                                                       @RequestParam(value = "amtS", required = false) Integer amtS,
                                                                       @RequestParam(value = "amtE", required = false) Integer amtE,
                                                                       @RequestParam(value = "limitAmt", required = false) Double limitAmt,
                                                                       @RequestParam(value = "axisNum", required = false) Integer axisNum,
                                                                       @RequestParam(value = "startT", required = false) String startT,
                                                                       @RequestParam(value = "endT", required = false) String endT) {
        return preCheckDataHistoryService.findAll(page, size, carNo, lane, limitAmt, axisNum, startT, endT);
    }

}
