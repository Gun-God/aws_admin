package cn.timelost.aws.vo;

import lombok.Data;

import java.util.List;

/**
 * @author :hyw
 * @version 1.0
 * @date : 2023/01/07 19:10
 */
@Data
public class PermissionVo {

    public String title;
    public Integer id;
    public Boolean checked;
    public List<PermissionVo> children;
}
