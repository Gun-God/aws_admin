package cn.timelost.aws.service.impl;

import cn.timelost.aws.config.realm.UserRealm;
import cn.timelost.aws.entity.AwsLed;
import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsPreCheckData;
import cn.timelost.aws.entity.AwsPreCheckDataHistory;
import cn.timelost.aws.mapper.AwsLedMapper;
import cn.timelost.aws.mapper.AwsNspOrgMapper;
import cn.timelost.aws.service.AwsLedService;
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
 * led显示记录表 服务实现类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@Service
public class AwsLedServiceImpl extends ServiceImpl<AwsLedMapper, AwsLed> implements AwsLedService {

    @Autowired
    AwsLedMapper ledMapper;
    @Autowired
    AwsNspOrgMapper nspOrgMapper;

    @Override
    public PageInfo<AwsLed> findAll(int pageNum, int pageSize, String carNo, String startT, String endT,String oCode) {
        String orgCode= UserRealm.ORGCODE;

        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        QueryWrapper<AwsLed> qw = new QueryWrapper<>();
        if (!("").equals(carNo) && carNo != null)
            qw.like("content", carNo);
        if (startT != null && !startT.equals("")) {
            try {
                qw.lambda().between(AwsLed::getCreateTime, sm.parse(startT), sm.parse(endT));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
//        if(orgCode!=null && (!orgCode.equals("9999")) )
//        {
//            qw.eq("org_code", orgCode);
//        }
        int roleId= UserRealm.ROLEID;
        if(oCode!=null && !("".equals(oCode))) {//选了
            if (roleId == 1 || roleId==3) {
                qw.eq("org_code", oCode);
            }
            else {
                String oCodes = UserRealm.ORGCODE;
                qw.eq("org_code", oCodes);
            }
        }
        else
        {//针对默认
            if(roleId==3)
            {
                String oCodes = UserRealm.ORGCODE;
                AwsNspOrg orgs= nspOrgMapper.selectOne(new QueryWrapper<AwsNspOrg>().eq("check_org",oCodes).eq("type",0).eq("state",1).orderByDesc("build_time").last("limit 1"));
                //将orgcodes作为查询条件
                qw.eq("org_code", orgs.getCode());
            }
            else {
                String oCodes = UserRealm.ORGCODE;
                qw.eq("org_code", oCodes);
            }
        }


        qw.orderByDesc("create_time");
        PageHelper.startPage(pageNum, pageSize);
        List<AwsLed> ledList = ledMapper.selectList(qw);
        return new PageInfo<>(ledList);
    }
}
