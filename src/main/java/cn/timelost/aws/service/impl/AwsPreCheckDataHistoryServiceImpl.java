package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.*;
import cn.timelost.aws.entity.vo.ExcelPreCheckDataHistory;
import cn.timelost.aws.mapper.*;
import cn.timelost.aws.service.AwsPreCheckDataHistoryService;
import cn.timelost.aws.utils.ExcelUtils;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * <p>
 * 预检信息记录历史表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsPreCheckDataHistoryServiceImpl extends ServiceImpl<AwsPreCheckDataHistoryMapper, AwsPreCheckDataHistory> implements AwsPreCheckDataHistoryService {


    @Autowired
    AwsPreCheckDataHistoryMapper preCheckDataHistoryMapper;
    @Autowired
    AwsPreCheckDataMapper   preCheckDataMapper;
    @Autowired
    AwsNspOrgMapper  nspOrgMapper;
    @Autowired
    AwsScanMapper scanMapper;
    @Autowired
    AwsDownloadLogMapper downloadLogMapper;

    @Override
    public List<AwsPreCheckDataHistory> findAll(int pageNum, int pageSize, String carNo, Integer[] lane, Double limitAmt, Integer[] axisNum, String startT, String endT,Double preAmtStart,Double preAmtEnd, String preNo,String orgCode,Integer color,Boolean isOverAmt) {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        LambdaQueryWrapper<AwsPreCheckDataHistory> qw = new LambdaQueryWrapper<>();
//        String realOCode= UserRealm.ORGCODE;
        int roleId=UserRealm.ROLEID;
        // QueryWrapper<AwsPreCheckData> qw2=new QueryWrapper<>();

        if (!("").equals(carNo) && carNo != null)
        {
            qw.like(AwsPreCheckDataHistory::getCarNo, carNo);
           // qw2.like("car_no", carNo);
        }

        if (lane != null && lane.length>0)
        {
//            qw.nested(new Consumer<QueryWrapper<AwsPreCheckDataHistory>>() {
//                @Override
//                public void accept(QueryWrapper<AwsPreCheckDataHistory> awsPreCheckDataHistoryQueryWrapper) {
//                    qw.eq("lane", lane[0]);
//                    if(lane.length>1)
//                    {
//                        for(int i=1;i<lane.length;i++)
//                        {
//                            qw.or().eq("lane", lane[i]);
//                        }
//                    }
//
//                }
//            });
            //重新映射一下

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
                        laneMap.put(as.getShowLane(),as.getLane());
                    }
                }
                //映射
                for(int i=0;i<lane.length;i++)
                {
                    if(laneMap.get(lane[i])!=null)
                        lane[i]=laneMap.get(lane[i]);
                    else
                        lane[i]=-1;
                }
                qw.in(AwsPreCheckDataHistory::getLane, lane);
            }


            //qw2.eq("lane", lane);
        }
        if (limitAmt != null && limitAmt != 0)
        {
            qw.eq(AwsPreCheckDataHistory::getLimitAmt, limitAmt);
            //qw2.eq("limit_amt", limitAmt);
        }

        if(preNo!=null &&!"".equals(preNo))
        {
            qw.eq(AwsPreCheckDataHistory::getPreNo,preNo);
        }

//        if (limitAmt != null && limitAmt != 0)
//        {
//            qw.eq("limit_amt", limitAmt);
//            //qw2.eq("limit_amt", limitAmt);
//        }

        if (axisNum != null && axisNum.length>0)
        {
            qw.in(AwsPreCheckDataHistory::getAxisNum,axisNum);

            //   qw2.eq("axis_num", axisNum);
        }

        if(color != null && color!=-1)
        {
            qw.eq(AwsPreCheckDataHistory::getColor, color);
        }

        if(preAmtStart != null && preAmtEnd!=null)
        {
            qw.between(AwsPreCheckDataHistory::getPreAmt, preAmtStart, preAmtEnd);
        }

        if(isOverAmt!=null && isOverAmt)
        {
           // qw.gt("pre_amt","limit_amt");
            qw.apply("pre_amt>limit_amt");
        }

        if (startT != null && !startT.equals("")) {
            try {
                qw.between(AwsPreCheckDataHistory::getCreateTime, sm.parse(startT), sm.parse(endT));
               // qw2.lambda().between(AwsPreCheckData::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }



        if(orgCode!=null && !("".equals(orgCode))) {//选了
            if (roleId == 1 || roleId==3) {
                qw.eq(AwsPreCheckDataHistory::getOrgCode, orgCode);
            }
            else {
                String oCode = UserRealm.ORGCODE;
                qw.eq(AwsPreCheckDataHistory::getOrgCode, oCode);
            }
        }
        else
        {//针对默认
            if(roleId==3)
            {
                String oCode = UserRealm.ORGCODE;
                AwsNspOrg orgs= nspOrgMapper.selectOne(new QueryWrapper<AwsNspOrg>().eq("check_org",oCode).eq("type",0).eq("state",1).orderByDesc("build_time").last("limit 1"));
                //将orgcodes作为查询条件
                qw.eq(AwsPreCheckDataHistory::getOrgCode, orgs.getCode());
            }
            else {
                String oCode = UserRealm.ORGCODE;
                qw.eq(AwsPreCheckDataHistory::getOrgCode, oCode);
            }
        }


//        if(orgCode!=null && !("".equals(orgCode)) && roleId==1 )//只有超级管理员才可以选择不同的org
//        {
//            qw.eq("org_code",orgCode);
//        }

        qw.orderByDesc(AwsPreCheckDataHistory::getCreateTime);
        //qw2.orderByDesc("create_time");
        if(pageSize!=-1)
        {
            PageHelper.startPage(pageNum, pageSize);
            List<AwsPreCheckDataHistory> historyList = preCheckDataHistoryMapper.selectList(qw);
            return historyList;
        }
        else{//-1表示不分页
//            PageHelper.startPage(pageNum, pageSize);
            List<AwsPreCheckDataHistory> historyList = preCheckDataHistoryMapper.selectList(qw);

            return historyList;
        }
//        return null;
      ///  List<AwsPreCheckData>  perCheckList = preCheckDataMapper.selectList(qw2);
//        for(AwsPreCheckData pc:perCheckList)
//        {
//            AwsPreCheckDataHistory pch=new AwsPreCheckDataHistory();
//            pch.setAxisNum(pc.getAxisNum());
//            pch.setCarNo(pc.getCarNo());
//            pch.setCreateTime(pc.getCreateTime());
//            pch.setSpeed(pc.getSpeed());
//            pch.setCarTypeId(pc.getCarTypeId());
//            pch.setLane(pc.getLane());
//            pch.setIsShow(pc.getIsShow());
//            pch.setLimitAmt(pc.getLimitAmt());
//            pch.setPreAmt(pc.getPreAmt());
//            pch.setWeight(pc.getWeight());
//            historyList.add(pch);
//
//        }

//        return new PageInfo<>(historyList);

    }

    public void exportExcel(List<AwsPreCheckDataHistory> apdhList, AwsDownloadLog adll,String orgCode,String url){

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
        XSSFWorkbook wb= ExcelUtils.getSimpleXSSFWorkbook(epdhList,ExcelPreCheckDataHistory.class,adll);

        int flag=0;
        try {
            File file=new File(url);
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



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        adll.setState(1);
        downloadLogMapper.update(adll, new QueryWrapper<AwsDownloadLog>().eq("id",adll.getId()));

    }


}
