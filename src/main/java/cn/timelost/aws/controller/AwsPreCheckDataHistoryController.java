package cn.timelost.aws.controller;


import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.entity.AwsScan;
import cn.timelost.aws.entity.vo.ExcelPreCheckDataHistory;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.mapper.AwsScanMapper;
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

        //得到所有检测站
        QueryWrapper<AwsNspOrg> qw = new QueryWrapper<>();
        qw.lambda().eq(AwsNspOrg::getState, 1);
        List<AwsNspOrg> anoList =  nspOrgMapper.selectList(qw);
        //得到车道映射
        List<AwsScan> asl=null;
        String ocode="";
        //查询orgcode下所有
        if(orgCode!=null && orgCode!="") {
            ocode = orgCode;
        }
        else{
            ocode = UserRealm.ORGCODE;
        }
        asl=scanMapper.selectList(new QueryWrapper<AwsScan>().lambda().eq(AwsScan::getOrgCode, ocode).eq(AwsScan::getType,3).eq(AwsScan::getDirection,1));
        HashMap<Integer,Integer> laneMap=new HashMap<>();
        if(asl!=null)
        {
            for(AwsScan as:asl)
            {
                if(laneMap.get(as.getShowLane())==null)
                {
                    laneMap.put(as.getLane(),as.getShowLane());
                }
            }
        }
        //前提是查询的数据小于7w条
        //导出excel
        List<ExcelPreCheckDataHistory> epdhList=new LinkedList<ExcelPreCheckDataHistory>();
        String[] colorArray={"蓝色","黄色","其他"};

        for(AwsPreCheckDataHistory apdh:apdhList)
        {
            ExcelPreCheckDataHistory epdh=new ExcelPreCheckDataHistory();

            BeanUtils.copyProperties(apdh,epdh);
            for(AwsNspOrg ano:anoList)
            {
                if(epdh.getOrgCode().equals(ano.getCode()))
                {
                    epdh.setOrgCode(ano.getName());
                }
            }
            //赋值时间
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            epdh.setPassTimeShow(sdf.format(epdh.getPassTime()) );
            epdh.setCreateTimeShow(sdf.format(epdh.getCreateTime()));
//

            if(epdh.getColor()!=null){
            if(epdh.getColor()<3 && epdh.getColor()>0)
                epdh.setRealColor(colorArray[(int)epdh.getColor()]);
            else
                epdh.setRealColor("其他");
            }

            if(epdh.getLane()!=null)
            {
                if(asl!=null)
                {
                   Integer laneInfo=epdh.getLane();
                   epdh.setLane(laneMap.get(laneInfo));
                }
            }

            epdhList.add(epdh);
        }
        //利用工具类
        XSSFWorkbook wb= ExcelUtils.getSimpleXSSFWorkbook(epdhList,ExcelPreCheckDataHistory.class);

        // 7. 输出文件
        // 7.1 把excel文件写到磁盘上
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
        int flag=0;
        try {
//            String fileName ="excels"+File.separator+"test.xlsx";
//            fileName=fileName;
//            File file=new File( "F:"+File.separator+"excels"+File.separator+fileName);
            File file=new File( excelPath+fileName);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            if(!file.exists()){
                file.createNewFile();
            }
            file.setWritable(true);
            FileOutputStream outputStream = new FileOutputStream(file);
            wb.write(outputStream); // 把excel写到输出流中
            outputStream.close(); // 关闭流
            wb.close();
            return ResultVo.success(fileName);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

       return  ResultVo.fail("error when export!");

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

        List<String> imgPaths=new ArrayList<>();
        //得到图片路径
        for (AwsPreCheckDataHistory apdh : apdhList)
        {
            String p=carImgPath+apdh.getImg();
            System.err.println(p);
            imgPaths.add(p);
        }

        //获取图片路径
//        String parentPath=carImgPath+"test\\";
//        File files=new File(parentPath);
//        File[] filelist=files.listFiles();
//        for (File file : filelist) {
//            imgPaths.add(file.getName());
//            System.out.println(file.getName());
//        }


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

//        ZipUtil.toZip(imgPaths, "F:\\export_img\\"+fileName,0);

    //    ZipUtil.toZip(imgPaths, carImgExportPath+fileName,0);

        return  ResultVo.success(fileName);

//        pageData.


    }


}
