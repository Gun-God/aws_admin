package cn.timelost.aws.controller;


import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.mapper.AwsPreCheckDataMapper;
import cn.timelost.aws.service.AwsPreCheckDataService;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
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

    @Autowired
    AwsNspOrgMapper  nspOrgMapper;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public ResultVo getPreCheckDataNewList(@RequestParam("orgCode") String orgCode){
//        String orgCode=UserRealm.ORGCODE;
        String oCode=UserRealm.ORGCODE;
        int rId=UserRealm.ROLEID;
        List<AwsPreCheckData> dataList=null;

//        if()
        if(rId==3)//精检用户
        {
//            查询当前精检下的所有orgcode
            List<AwsNspOrg> orgs= nspOrgMapper.selectList(new QueryWrapper<AwsNspOrg>().eq("check_org",oCode).eq("type",0));
            //将orgcodes作为查询条件
            String[] orgArray=orgs.stream().map(AwsNspOrg::getCode).toArray(String[]::new);
           //提取orgs里面的所有精检站orgCode
            dataList=preCheckDataMapper.selectList(new QueryWrapper<AwsPreCheckData>().in("org_code",orgArray).orderByDesc("create_time").last("limit 30"));
            return ResultVo.success(dataList);
        }


        if(oCode!=null && (!oCode.equals("9999")) )
        {
            dataList=preCheckDataMapper.selectList(new QueryWrapper<AwsPreCheckData>().eq("org_code",oCode).orderByDesc("create_time").last("limit 30"));
        }else{//超级权限 暂时用不到
            dataList=preCheckDataMapper.selectList(new QueryWrapper<AwsPreCheckData>().orderByDesc("create_time").last("limit 30"));
        }
        return ResultVo.success(dataList);
    }

    @RequestMapping(value = "/getNowPreCheckData", method = RequestMethod.GET)
    public ResultVo getNowPreCheckData(){
        return preCheckDataService.getNowPreCheckData();
    }

    @Scheduled(cron ="0 1 0 * * ? ")
    public void PreCheckDataScheduledInto(){
         preCheckDataService.transferPreData();
    }

//    @Scheduled(cron ="0/1 * * * * ? ")
//    public void PreCheckDataScheduledIntoTemp(){
//        preCheckDataService.transferPreData();
//    }

    @RequestMapping(value = "/getCarCountCurrent", method = RequestMethod.GET)
    public int getCarCountCurrent(){

        return preCheckDataService.getCarCountToday();
    }

    @RequestMapping(value = "/getCarOverLoadCurrent", method = RequestMethod.GET)
    public ResultVo getCarOverLoadCurrent(){
        return preCheckDataService.getCarOverLoadToday();
    }

    @RequestMapping(value = "/getCarCountLast24H", method = RequestMethod.GET)
    public ResultVo getCarCountLast24H(){
        return preCheckDataService.getCarCountLast24H();
    }

    @RequestMapping(value = "/getCarTypeCountCurrent", method = RequestMethod.GET)
    public ResultVo getCarTypeCountCurrent(){
        return preCheckDataService.getCarTypeCountCurrent();
    }


    @RequestMapping(value = "/getListByCarNo", method = RequestMethod.GET)
    public ResultVo getPreCheckDataByCarNoList(@RequestParam("carNo") String carNo){
        String orgCode=UserRealm.ORGCODE;
        List<AwsPreCheckData> dataList=null;
        List<AwsNspOrg> orgs= nspOrgMapper.selectList(new QueryWrapper<AwsNspOrg>().eq("check_org",orgCode).eq("type",0));
        //将orgcodes作为查询条件

        if(orgs.size()==0)
        {
            return ResultVo.fail("暂无绑定");
        }

        String[] orgArray=orgs.stream().map(AwsNspOrg::getCode).toArray(String[]::new);
        dataList=preCheckDataMapper.selectList(new QueryWrapper<AwsPreCheckData>().lambda().in(AwsPreCheckData::getOrgCode,orgArray).like(AwsPreCheckData::getCarNo,carNo).orderByDesc(AwsPreCheckData::getCreateTime).last("limit 15"));

        return ResultVo.success(dataList);
    }




}
