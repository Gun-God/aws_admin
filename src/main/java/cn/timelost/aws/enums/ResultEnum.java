package cn.timelost.aws.enums;

import lombok.Getter;

/**
 * @author: hyw
 * @Date: 2022/12/25 10:04
 */
@Getter
public enum ResultEnum {
    SUCCESS(200, "成功"),
    DEPARTMENT_NOT_EXIST(10, "部门未找到"),
    POSITION_NOT_EXIST(11, "岗位未找到"),
    PERSONAL_NOT_EXIST(12, "员工未找到"),
    PERSONAL_TRAIN_NOT_EXIST(13, "员工培训记录未找到"),
    PERSONAL_REWARD_NOT_EXIST(14, "员工奖惩记录未找到"),
    PERSONAL_SALARY_NOT_EXIST(15, "员工薪资记录未找到"),
    RECRUIT_NOT_EXIST(16, "招聘记录未找到"),
    SETTING_NOT_EXIST(17, "配置未找到"),

    USER_NOT_EXIST(20, "用户不存在"),
    PASSWORD_FAIL(21, "用户名或密码错误"),
    CODE_NOT_EXIST(22, "请输入验证码"),
    CODE_FAIL(23, "验证码错误"),
    USER_EXIST(25, "账号已存在"),
    PASSWORD_ERROR(26, "原始密码错误"),
    ORG_NOT_EXIST(27, "检测站不存在"),
    ORG_CODE_NOT_EXIST(28, "检测站编号已存在"),


    UPLOAD_FAIL(50, "服务器上传失败"),
    UPLOAD_NOT_ENABLE(51, "上传配置未开启"),
    AUTHENTICATE_FAIL(5000, "认证异常,请重新登录"),
    AUTHORIZATION_FAIL(5001, "用户无权限"),
    ERROR(500, "未知错误"),
    PARAM_ERROR(501, "参数错误"),
    JB_ERROR(-1, "员工工号不存在"),
    ADD_ERROR(-2, "账号已存在"),
    ORG_ISNOT_EXIST(-4, "检测站信息不完整"),
    ADD_CHECKE_ERROR(-3,"精检添加错误"),
    NO_NEED_DOWNLOAD_ERROR(-5,"该id无下载数据"),
    PRECHECK_QUERY_ERROR(-6,"查询无数据");

    private final Integer code;
    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
