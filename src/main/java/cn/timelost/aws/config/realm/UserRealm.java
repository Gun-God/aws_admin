package cn.timelost.aws.config.realm;

import cn.timelost.aws.config.JWTToken;
import cn.timelost.aws.config.utils.JWTUtils;
import cn.timelost.aws.entity.AwsRole;
import cn.timelost.aws.entity.AwsSystemSetting;
import cn.timelost.aws.entity.AwsUser;
import cn.timelost.aws.mapper.AwsRoleMapper;
import cn.timelost.aws.mapper.AwsSystemSettingMapper;
import cn.timelost.aws.service.AwsUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * @author: hyw
 * @Date: 2023/1/18 20:47
 */
@Slf4j
public class UserRealm extends AuthorizingRealm {

    public static String USERNAME;

    @Resource
    AwsUserService userService;
    @Resource
    AwsRoleMapper roleMapper;




    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("用户授权...");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        AwsUser user = (AwsUser) principalCollection.getPrimaryPrincipal();
        AwsRole role = roleMapper.selectById(user.getRoleId());
        authorizationInfo.addRole(role.getRoleName());
        authorizationInfo.addStringPermission(null);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("用户认证...");

        String token = (String) authenticationToken.getCredentials();
        String username = JWTUtils.getUsername(token);
        USERNAME=username;
        System.err.println("当前用户 = "+ username);

        if (username == null) {
            throw new AuthenticationException("token异常");
        }
        AwsUser userBean = userService.findByUsername(username);

        if (!JWTUtils.verify(token, username, userBean.getPassword())) {
            throw new AuthenticationException("账号或密码错误");
        }
        return new SimpleAuthenticationInfo(userBean, token, getName());
    }
}
