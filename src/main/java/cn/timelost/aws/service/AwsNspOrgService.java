package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsNspOrg;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.entity.vo.AwsUserForm;
import cn.timelost.aws.vo.ResultVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 检测站信息表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsNspOrgService extends IService<AwsNspOrg> {


    PageInfo<AwsNspOrg> findList(int pageNum, int pageSize);

    ResultVo deleteById(int id);

    ResultVo insert(AwsNspOrg org);

    ResultVo updateUserById(AwsNspOrg org);

    ResultVo selectAllOrg();

    ResultVo selectAllperCheckOrg();

    ResultVo selectAllCheckOrg();

    ResultVo selectPerOrgByCheckOrg(String checkOrg);

}
