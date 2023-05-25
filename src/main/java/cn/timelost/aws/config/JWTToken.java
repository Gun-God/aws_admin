package cn.timelost.aws.config;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author: hyw
 * @Date: 2023/1/18 20:49
 */
public class JWTToken implements AuthenticationToken {

    private final String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}