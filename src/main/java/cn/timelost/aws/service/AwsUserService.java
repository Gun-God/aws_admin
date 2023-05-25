package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.entity.vo.AwsUserForm;
import cn.timelost.aws.vo.ResultVo;
import cn.timelost.aws.vo.input.UserForm;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsUserService extends IService<AwsUser> {


    AwsUser findByUsername(String username);

    AwsUser find(int id);

    PageInfo<AwsUser> findList(int pageNum, int pageSize);

    ResultVo deleteById(int id);

    ResultVo insert(AwsUser user);

    ResultVo updateUserById(AwsUserForm us);

    ResultVo modifyPwd(UserForm us);

    ResultVo removePwd(int id);


}
