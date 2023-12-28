package cn.timelost.aws.controller;


import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsDownloadLog;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.entity.AwsScan;
import cn.timelost.aws.entity.vo.ExcelPreCheckDataHistory;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsDownloadLogMapper;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.mapper.AwsScanMapper;
import cn.timelost.aws.service.AwsDownloadLogService;
import cn.timelost.aws.service.AwsNspOrgService;
import cn.timelost.aws.service.AwsPreCheckDataHistoryService;
import cn.timelost.aws.utils.ExcelUtils;
import cn.timelost.aws.utils.ZipUtil;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;

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
    @Autowired
    AwsNspOrgMapper nspOrgMapper;
    @Autowired
    AwsScanMapper scanMapper;
    @Autowired
    AwsDownloadLogService downloadLogService;

    @Value("${car-img.path}")
    private String carImgPath;
    @Value("${car-img.exportPath}")
    private String carImgExportPath;
    @Value("${excel.path}")
    private String excelPath;

    @RequestMapping(value = "/getHistoryList", method = RequestMethod.GET)
    public PageInfo<AwsPreCheckDataHistory> getPreCheckDataHistoryList(@RequestParam(value = "page") Integer page,
                                                                       @RequestParam(value = "size") Integer size,
                                                                       @RequestParam(value = "carNo", required = false) String carNo,
                                                                       @RequestParam(value = "lane", required = false) String lane,
                                                                       @RequestParam(value = "amtS", required = false) Integer amtS,
                                                                       @RequestParam(value = "amtE", required = false) Integer amtE,
                                                                       @RequestParam(value = "limitAmt", required = false) Double limitAmt,
                                                                       @RequestParam(value = "axisNum", required = false) String axisNum,
                                                                       @RequestParam(value = "startT", required = false) String startT,
                                                                       @RequestParam(value = "endT", required = false) String endT,
                                                                       @RequestParam(value = "preAmtStart", required = false) Double preAmtStart,
    @RequestParam(value = "preAmtEnd", required = false) Double preAmtEnd,
    @RequestParam(value = "preNo", required = false) String preNo,
                                                                       @RequestParam(value = "orgCode", required = false) String orgCode,
                                                                       @RequestParam(value = "color", required = false) Integer color,
                                                                       @RequestParam(value = "isOverAmt", required = false) Boolean isOverAmt


    )
    {
        Integer[] lane_nums=null;
        Integer[]  axisNum_nums=null;


        if(lane!=null && lane!="") {
            String[] newLane = lane.split(",");
            lane_nums = new Integer[newLane.length];
            for (int i = 0; i < newLane.length; i++) {
                lane_nums[i] = Integer.parseInt(newLane[i]);
            }
            //映射
        }

        if(axisNum!=null && axisNum!="") {
            String[] newAxisNum = axisNum.split(",");
            axisNum_nums = new Integer[newAxisNum.length];
            for (int i = 0; i < newAxisNum.length; i++) {
                axisNum_nums[i] = Integer.parseInt(newAxisNum[i]);
            }
        }

//        return preCheckDataHistoryService.findAll(page, size, carNo, lane_nums, limitAmt, axisNum_nums, startT, endT,preAmtStart, preAmtEnd, preNo,orgCode,color);
        List<AwsPreCheckDataHistory> aphList=preCheckDataHistoryService.findAll(page, size, carNo, lane_nums, limitAmt, axisNum_nums, startT, endT,preAmtStart, preAmtEnd, preNo,orgCode,color,isOverAmt);
        return new PageInfo<>(aphList);
    }



//
    @RequestMapping(value = "/exportPerCheckDataHistory", method = RequestMethod.GET)
    public ResultVo exportPerCheckDataHistory (@RequestParam(value = "page") Integer page,
                                               @RequestParam(value = "size") Integer size,
                                               @RequestParam(value = "carNo", required = false) String carNo,
                                               @RequestParam(value = "lane", required = false) String lane,
                                               @RequestParam(value = "amtS", required = false) Integer amtS,
                                               @RequestParam(value = "amtE", required = false) Integer amtE,
                                               @RequestParam(value = "limitAmt", required = false) Double limitAmt,
                                               @RequestParam(value = "axisNum", required = false) String axisNum,
                                               @RequestParam(value = "startT", required = false) String startT,
                                               @RequestParam(value = "endT", required = false) String endT,
                                               @RequestParam(value = "preAmtStart", required = false) Double preAmtStart,
                                               @RequestParam(value = "preAmtEnd", required = false) Double preAmtEnd,
                                               @RequestParam(value = "preNo", required = false) String preNo,
                                               @RequestParam(value = "orgCode", required = false) String orgCode,
                                               @RequestParam(value = "color", required = false) Integer color,
                                               @RequestParam(value = "isOverAmt", required = false) Boolean isOverAmt
    )
    {
        Integer[] lane_nums=null;
        Integer[]  axisNum_nums=null;

        if(startT==null && endT==null)
        {
            size=1000;
        }


        if(lane!=null && lane!="") {
            String[] newLane = lane.split(",");
            lane_nums = new Integer[newLane.length];
            for (int i = 0; i < newLane.length; i++) {
                lane_nums[i] = Integer.parseInt(newLane[i]);
            }
        }

        if(axisNum!=null && axisNum!="") {
            String[] newAxisNum = axisNum.split(",");
            axisNum_nums = new Integer[newAxisNum.length];
            for (int i = 0; i < newAxisNum.length; i++) {
                axisNum_nums[i] = Integer.parseInt(newAxisNum[i]);
            }
        }
        List<AwsPreCheckDataHistory> apdhList=preCheckDataHistoryService.findAll(page, size, carNo, lane_nums, limitAmt, axisNum_nums, startT, endT,preAmtStart, preAmtEnd, preNo,orgCode,color,isOverAmt);

        //无数据
        if(apdhList==null || apdhList.size()==0){
            return ResultVo.fail(ResultEnum.PRECHECK_QUERY_ERROR);//报错-6
        }

        //新建文件名
        String fileName="fail";
        String new_startT="fail";
        String new_endT="fail";
        if(startT!=null && endT!=null) {
            try {
                SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
                Date d1 = sm.parse(startT);
                Date d2 = sm.parse(endT);
                new_startT =sm.format(d1);
                new_endT=sm.format(d2);
//               new_endT = d2.toString();
            } catch (Exception e) {

            }
        }
        if(startT!=null && endT!=null)
        {
            fileName=new_startT+"_"+new_endT+"_"+(new Date().getTime())+".xlsx";
        }
        else{
            fileName="allDate_"+new Date().getTime()+".xlsx";
        }

        //创建下载任务
        AwsDownloadLog adll=new AwsDownloadLog();
        adll.setContent("下载预检历史表表格");
        adll.setType(0);
        adll.setFileName(fileName);
        adll.setUrl(excelPath+fileName);
        AwsDownloadLog new_adll=downloadLogService.createDownloadLog(adll);

        if(new_adll==null)
        {
            return ResultVo.fail(ResultEnum.ERROR);
        }

        String finalFileName = fileName;
        Thread thread=new Thread(new Runnable(){
            @Override
            public void run() {
                preCheckDataHistoryService.exportExcel(apdhList,new_adll,orgCode,excelPath+ finalFileName);
            }
        });
        thread.start();

        //调用service处理导出功能


       return  ResultVo.success(new_adll.getId());
//        pageData.
    }


    @RequestMapping(value = "/exportPerCheckDataHistoryImg", method = RequestMethod.GET)
    public ResultVo exportPerCheckDataHistoryImg (@RequestParam(value = "page") Integer page,
                                               @RequestParam(value = "size") Integer size,
                                               @RequestParam(value = "carNo", required = false) String carNo,
                                               @RequestParam(value = "lane", required = false) String lane,
                                               @RequestParam(value = "amtS", required = false) Integer amtS,
                                               @RequestParam(value = "amtE", required = false) Integer amtE,
                                               @RequestParam(value = "limitAmt", required = false) Double limitAmt,
                                               @RequestParam(value = "axisNum", required = false) String axisNum,
                                               @RequestParam(value = "startT", required = false) String startT,
                                               @RequestParam(value = "endT", required = false) String endT,
                                               @RequestParam(value = "preAmtStart", required = false) Double preAmtStart,
                                               @RequestParam(value = "preAmtEnd", required = false) Double preAmtEnd,
                                               @RequestParam(value = "preNo", required = false) String preNo,
                                               @RequestParam(value = "orgCode", required = false) String orgCode,
                                               @RequestParam(value = "color", required = false) Integer color,
                                                  @RequestParam(value = "isOverAmt", required = false) Boolean isOverAmt
    )
    {
        Integer[] lane_nums=null;
        Integer[]  axisNum_nums=null;

        if(startT==null && endT==null)
        {
            size=1000;
        }


        if(lane!=null && lane!="") {
            String[] newLane = lane.split(",");
            lane_nums = new Integer[newLane.length];
            for (int i = 0; i < newLane.length; i++) {
                lane_nums[i] = Integer.parseInt(newLane[i]);
            }
        }

        if(axisNum!=null && axisNum!="") {
            String[] newAxisNum = axisNum.split(",");
            axisNum_nums = new Integer[newAxisNum.length];
            for (int i = 0; i < newAxisNum.length; i++) {
                axisNum_nums[i] = Integer.parseInt(newAxisNum[i]);
            }
        }
        List<AwsPreCheckDataHistory> apdhList=preCheckDataHistoryService.findAll(page, size, carNo, lane_nums, limitAmt, axisNum_nums, startT, endT,preAmtStart, preAmtEnd, preNo,orgCode,color,isOverAmt);

        if(apdhList==null || apdhList.size()==0)
        {
            return ResultVo.fail(ResultEnum.PRECHECK_QUERY_ERROR);
        }


        List<String> imgPaths=new ArrayList<>();
        //得到图片路径
        for (AwsPreCheckDataHistory apdh : apdhList)
        {
            String p=carImgPath+apdh.getImg();
            System.err.println(p);
            imgPaths.add(p);
        }

//        获取图片路径
      /*  String parentPath=carImgPath+"test\\";
        File files=new File(parentPath);
        File[] filelist=files.listFiles();
        for (File file : filelist) {
            imgPaths.add(parentPath+file.getName());
            System.out.println(file.getName());
        }*/



        String fileName="fail";
        String new_startT="fail";
        String new_endT="fail";
        if(startT!=null && endT!=null) {
            try {
                SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
                Date d1 = sm.parse(startT);
                Date d2 = sm.parse(endT);
                new_startT =sm.format(d1);
                new_endT=sm.format(d2);
            } catch (Exception e) {

            }
        }
        if(startT!=null && endT!=null)
        {
            fileName=new_startT+"_"+new_endT+"_"+(new Date().getTime())+".zip";
        }
        else{
            fileName="allDate_"+new Date().getTime()+".zip";
        }

        //如果无误就创建下载任务
        AwsDownloadLog adll=new AwsDownloadLog();
        adll.setContent("下载预检历史表图片");
        adll.setFileName(fileName);
        adll.setType(1);
        adll.setUrl(carImgExportPath+fileName);
        AwsDownloadLog new_adll=downloadLogService.createDownloadLog(adll);

        if(new_adll==null)
        {
            return ResultVo.fail(ResultEnum.ERROR);
        }

        //调用service下载

        //System.out.println(new_adll.getId());
//        ZipUtil.toZip(imgPaths, "F:\\export_img\\"+fileName,0);
        //用线程运行该任务
        String finalFileName = fileName;
        Thread thread=new Thread(new Runnable(){
           @Override
           public void run() {
               ZipUtil.toZip(imgPaths, carImgExportPath+ finalFileName,1,new_adll);
           }
        });
        thread.start();


        return  ResultVo.success(new_adll.getId());

//        pageData.


    }


}
