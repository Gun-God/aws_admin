package cn.timelost.aws.controller;


import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsDownloadLog;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsCheckDataMapper;
import cn.timelost.aws.mapper.AwsDownloadLogMapper;
import cn.timelost.aws.mapper.AwsUserMapper;
import cn.timelost.aws.service.AwsCheckDataService;
import cn.timelost.aws.service.AwsUserService;
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
@RequestMapping("/awsDownloadLog")
public class AwsDownloadLogController {

//    @Autowired
//    AwsCheckDataService checkDataService;
//    @Autowired
//    AwsCheckDataMapper checkDataMapper;
    @Autowired
    AwsDownloadLogMapper awsDownloadLogMapper;
    @Autowired
    AwsUserService  awsUserService;

    @RequestMapping(value = "/getDownloadListByUser", method = RequestMethod.GET)
    public ResultVo getDownloadListByUser() {

// 查询当前userName
        String un=UserRealm.USERNAME;
          AwsUser us=awsUserService.findByUsername(un);
          Integer uid=us.getId();
          List<AwsDownloadLog> alist=awsDownloadLogMapper.selectList(new QueryWrapper<AwsDownloadLog>().lambda().eq(AwsDownloadLog::getUserId,uid));

          return ResultVo.success(alist);

    }


    @RequestMapping(value = "/getnewDownload", method = RequestMethod.GET)
    public ResultVo getnewDownloadByUser(@RequestParam Integer downloadId) {

// 查询当前userName
        String un=UserRealm.USERNAME;
        AwsUser us=awsUserService.findByUsername(un);
        Integer uid=us.getId();
        //查询未下载的
//        AwsDownloadLog adll=awsDownloadLogMapper.selectOne(new QueryWrapper<AwsDownloadLog>().lambda().eq(AwsDownloadLog::getUserId,uid).in(AwsDownloadLog::getState,1,2).orderByDesc(AwsDownloadLog::getOperTime).last("limit 1"));

        AwsDownloadLog adll=awsDownloadLogMapper.selectOne(new QueryWrapper<AwsDownloadLog>().lambda().eq(AwsDownloadLog::getId,downloadId));

        if(adll==null){
//            adll.getOperTime();
        return ResultVo.fail(ResultEnum.NO_NEED_DOWNLOAD_ERROR);
        }


        return ResultVo.success(adll);

    }




}
