package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsCheckData;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsCheckDataMapper;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.mapper.AwsUserMapper;
import cn.timelost.aws.service.AwsCheckDataService;
import cn.timelost.aws.utils.StringUtil;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 精检信息记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsCheckDataServiceImpl extends ServiceImpl<AwsCheckDataMapper, AwsCheckData> implements AwsCheckDataService {

    @Autowired
    AwsCheckDataMapper checkDataMapper;
    @Autowired
    AwsUserMapper userMapper;
    @Autowired
    AwsNspOrgMapper nspOrgMapper;

    @Override
    public PageInfo<AwsCheckData> findAll(int pageNum, int pageSize, String carNo, Integer lane, Double limitAmt, Integer[] axisNum, String startT, String endT,String oCode,Boolean isOverAmt) {
         String orgCode= UserRealm.ORGCODE;
        int rId=UserRealm.ROLEID;

        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        QueryWrapper<AwsCheckData> qw = new QueryWrapper<>();
        if (!("").equals(carNo) && carNo != null)
            qw.like("car_no", carNo);
        if (lane != null && lane != 0)
            qw.eq("lane", lane);
        if (limitAmt != null && limitAmt != 0)
            qw.eq("limit_amt", limitAmt);

        if(isOverAmt!=null && isOverAmt)
        {
            qw.gt("over_amt",0);
        }

//        if (axisNum != null && axisNum.length>0)
//        {
//            qw.in(AwsPreCheckDataHistory::getAxisNum,axisNum);
//
//            //   qw2.eq("axis_num", axisNum);
//        }

        if (startT != null && !startT.equals("")) {
            try {
                qw.lambda().between(AwsCheckData::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if(oCode!=null && !("".equals(oCode))) {//选了
            if (rId == 1 || rId==3) {//大 中用户
                qw.eq("org_code", oCode);
            }
            else { //小用户
                String myOCode = UserRealm.ORGCODE;
                qw.eq("org_code", myOCode);
            }
        }
        else
        {
            if(rId==3)//进入页面后默认查询所有旗下的精检站
            {
                String myoCode = UserRealm.ORGCODE;
//                AwsNspOrg orgs= nspOrgMapper.selectOne(new QueryWrapper<AwsNspOrg>().eq("check_org",myoCode).eq("type",0).orderByDesc("build_time").last("limit 1"));
//                将orgcodes作为查询条件
                qw.eq("check_org_code", myoCode);//
            }
            else {
                String myoCode = UserRealm.ORGCODE;
                qw.eq("org_code", myoCode);
            }
        }


//        if(rId==3)
//        {
//            //checkadmin
////            if()
//
//            qw.eq("check_org_code",orgCode);
//        }
//        else if(rId!=1){
//            qw.eq("org_code",orgCode);
//        }



        qw.orderByDesc("check_time");
        PageHelper.startPage(pageNum, pageSize);
        List<AwsCheckData> historyList = checkDataMapper.selectList(qw);
        return new PageInfo<>(historyList);
    }


    @Override
    public ResultVo insert(AwsCheckData cData) {
        //这里是否要添加重复性判断
        //生成精检流水号
        String checkNo=StringUtil.genNo();
        cData.setCode(checkNo);
        //精检时间生成
        cData.setCheckTime(new Date());
        //添加操作员
        AwsUser user = userMapper.selectOne(new QueryWrapper<AwsUser>().eq("username", UserRealm.USERNAME));
        cData.setCheckOper(user.getUserCode() + "-" + user.getName());

       if(checkDataMapper.insert(cData)!=0)
            return ResultVo.success();
       else
           return ResultVo.fail(ResultEnum.ADD_CHECKE_ERROR);
    }
}
