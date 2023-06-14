package cn.timelost.aws.service;

import cn.timelost.aws.entity.AwsUserLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 用户操作记录表 服务类
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
public interface AwsUserLogService extends IService<AwsUserLog> {


    void InsertUserLog(String content,int type);

    PageInfo<AwsUserLog> findAll(int pageNum, int pageSize);


}
