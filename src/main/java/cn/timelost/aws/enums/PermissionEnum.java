package cn.timelost.aws.enums;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;


/**
 * @author :hyw
 * @version 1.0
 * @date : 2023/01/07 19:16
 */
@Getter
@Log4j2
public enum PermissionEnum {

    TITLE1(1,"员工管理",false),
    TITLE2(1,"员工管理",true),
    TITLE3(1,"出勤管理",true),
    TITLE4(4,"部门管理",false),
    TITLE5(4,"部门管理",true),
    TITLE6(4,"部门岗位管理",true),
    TITLE7(7,"人事管理",false),
    TITLE8(7,"招聘管理",true),
    TITLE9(7,"考核管理",true),
    TITLE10(7,"人事变动",true),
    TITLE11(7,"培训管理",true),
    TITLE12(7,"奖惩管理",true),
    TITLE13(7,"薪资管理",true),
    TITLE14(14,"系统设置",false),
    TITLE15(14,"用户管理",true),
    TITLE16(14,"角色管理",true);





    private Integer perId;
    private Boolean children;
    private String title;

    PermissionEnum(Integer perId, String title,Boolean children) {
        this.perId = perId;
        this.title = title;
        this.children = children;
    }





    public static void main(String[] args) {


        System.err.println(PermissionEnum.getTitleById(1));
    }

    public static String getTitleById(Integer id) {
        PermissionEnum em;
        try {
            em=PermissionEnum.valueOf("TITLE"+id);
            return em.title;
        }catch (Exception e){
           log.error("无对应权限id");
        }
        return null;
    }
    public static int getPerIdById(Integer id) {
        PermissionEnum em;
        try {
            em=PermissionEnum.valueOf("TITLE"+id);
            return em.perId;
        }catch (Exception e){
            log.error("无对应权限id");
        }
        return 0;
    }

    public static Boolean ifChildren(Integer id) {
        PermissionEnum em;
        try {
            em=PermissionEnum.valueOf("TITLE"+id);
            return em.children;
        }catch (Exception e){
            log.error("无对应权限id");
        }
        return null;
    }
}
