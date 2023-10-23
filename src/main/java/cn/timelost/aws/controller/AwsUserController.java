package cn.timelost.aws.controller;


import cn.timelost.aws.config.JWTToken;
import cn.timelost.aws.config.utils.JWTUtils;
import cn.timelost.aws.entity.AwsSystemSetting;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.entity.vo.AwsUserForm;
import cn.timelost.aws.enums.ResultEnum;
import cn.timelost.aws.mapper.AwsSystemSettingMapper;
import cn.timelost.aws.service.AwsUserLogService;
import cn.timelost.aws.service.AwsUserService;
import cn.timelost.aws.vo.ResultVo;
import cn.timelost.aws.vo.input.UserForm;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author HuangYW
 * @since 2023-05-15
 */
@RestController
@RequestMapping("/user")
public class AwsUserController {

    @Autowired
    AwsUserService userService;

    @Autowired
    AwsUserLogService logService;

    @Resource
    AwsSystemSettingMapper systemSettingMapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultVo login(@RequestBody @Valid UserForm user) {
        AwsSystemSetting setting = systemSettingMapper.selectOne(new QueryWrapper<AwsSystemSetting>().eq("setting", "EXPIRE_TIME"));
        try {
            /// System.err.println("hahahah" + setting.getAttributeName());
            JWTUtils.EXPIRE_TIME = Long.parseLong(setting.getMsg()) * 60 * 60 * 1000;
        } catch (Exception e) {
            System.err.println(e);
        }

        String username = user.getUsername();
        String password = user.getPassword();
        AwsUser us = userService.findByUsername(username);
        if (us == null)
            return ResultVo.fail(ResultEnum.USER_NOT_EXIST);
        String salt = us.getSalt();
        Md5Hash md5Hash = new Md5Hash(password, salt, 100);
        //生成token
        String token = JWTUtils.sign(username, md5Hash.toHex());
        //执行登入：（出现异常被全局异常捕捉）
        SecurityUtils.getSubject().login(new JWTToken(token));
        user.setToken(token);
        user.setOrgCode(us.getOrgCode());
        user.setId(us.getId());
        logService.InsertUserLog("用户" + us.getUserCode() + "登录", 0);
        return ResultVo.success(user);
    }


    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public PageInfo<AwsUser> getUserDataList(@RequestParam(value = "page") Integer page,
                                             @RequestParam(value = "size") Integer size) {
        return userService.findList(page, size);
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    ////@RequiresRoles("admin")
    public ResultVo add(@RequestBody AwsUser us) {
        return userService.insert(us);
    }


    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    ////@RequiresRoles("admin")
    public ResultVo delete(@RequestParam("id") Integer id) {
        return userService.deleteById(id);
    }


    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    //@RequiresRoles("admin")
    public ResultVo update(@RequestBody AwsUserForm us) {
        return userService.updateUserById(us);
    }

    @RequestMapping(value = "/removePwd", method = RequestMethod.GET)
    //@RequiresRoles("admin")
    public ResultVo removePwd(@RequestParam(value = "id") Integer id) {
        return userService.removePwd(id);
    }


//    @RequestMapping(value = "image", method = RequestMethod.GET)
//    public void code(@RequestParam(value = "timestamp") String timestamp, HttpServletResponse response)
//            throws IOException {
//        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100, 4, 20);
//        lineCaptcha.write(response.getOutputStream());
//        cache.put(timestamp, lineCaptcha.getCode());
//    }

//    @RequestMapping(value = "/role/select", method = RequestMethod.GET)
//    public List<Role> role() {
//        return userService.roleList();
//    }

    @RequestMapping(value = "/modifyPwd", method = RequestMethod.POST)
    public ResultVo modifyPwd(@RequestBody UserForm us) {
        return userService.modifyPwd(us);

    }


}
