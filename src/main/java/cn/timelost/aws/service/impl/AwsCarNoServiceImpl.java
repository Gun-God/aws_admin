package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsCarNo;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.mapper.AwsCarNoMapper;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.service.AwsCarNoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * <p>
 * 车牌抓拍记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsCarNoServiceImpl extends ServiceImpl<AwsCarNoMapper, AwsCarNo> implements AwsCarNoService {

    @Autowired
    AwsCarNoMapper carNoMapper;
    @Autowired
    AwsNspOrgMapper nspOrgMapper;

    @Override
    public PageInfo<AwsCarNo> findAll(int pageNum, int pageSize, String carNo, String startT, String endT,String orgCode,Integer color) {
        int roleId= UserRealm.ROLEID;
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        QueryWrapper<AwsCarNo> qw = new QueryWrapper<>();
        if (!("").equals(carNo) && carNo != null)
            qw.like("car_no", carNo);
        if (startT != null && !startT.equals("")) {
            try {
                qw.lambda().between(AwsCarNo::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(color != null && color!=-1)
        {
            qw.eq("color", color);
        }


//        if(roleId==1 && orgCode!=null && !("".equals(orgCode)))
//        {
//            qw.eq("org_code",orgCode);
//        }
//        else{
//            String oCode= UserRealm.ORGCODE;
//            qw.eq("org_code",oCode);
//        }

        if(orgCode!=null && !("".equals(orgCode))) {//选了
            if (roleId == 1 || roleId==3) {
                qw.eq("org_code", orgCode);
            }
            else {
                String oCode = UserRealm.ORGCODE;
                qw.eq("org_code", oCode);
            }
        }
        else
        {//针对默认
            if(roleId==3)
            {
                String oCode = UserRealm.ORGCODE;
                AwsNspOrg orgs= nspOrgMapper.selectOne(new QueryWrapper<AwsNspOrg>().eq("check_org",oCode).eq("type",0).eq("state",1).orderByDesc("build_time").last("limit 1"));
                //将orgcodes作为查询条件
                qw.eq("org_code", orgs.getCode());
            }
            else {
                String oCode = UserRealm.ORGCODE;
                qw.eq("org_code", oCode);
            }
        }



        qw.orderByDesc("create_time");
        PageHelper.startPage(pageNum, pageSize);
        List<AwsCarNo> awsCarNos = carNoMapper.selectList(qw);
        return new PageInfo<>(awsCarNos);
    }
}
