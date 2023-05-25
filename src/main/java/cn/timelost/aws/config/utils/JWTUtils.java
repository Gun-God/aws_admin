package cn.timelost.aws.config.utils;

import cn.timelost.aws.entity.AwsSystemSetting;
import cn.timelost.aws.mapper.AwsRoleMapper;
import cn.timelost.aws.mapper.AwsSystemSettingMapper;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

/**
 * @author: hyw
 * @Date: 2023/1/18 20:39
 */
@Slf4j
public class JWTUtils {

    /**
     * 过期时间30分钟
     */
    public static  long EXPIRE_TIME = 30 * 60 * 1000;




    /**
     * 生成签名,
     *
     * @param username 用户名
     * @param secret   用户的密码
     * @return 加密的token
     */
    public static String sign(String username, String secret) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);

        System.err.println("登录时间"+EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(secret);
        // 附带username信息
        return JWT.create()
                .withClaim("username", username)
                .withIssuedAt(new Date())
                .withExpiresAt(date)
                .sign(algorithm);
    }

    /**
     * 校验token是否正确
     *
     * @param token  密钥
     * @param secret 用户的密码
     * @return 是否正确
     */
    public static boolean verify(String token, String username, String secret) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (TokenExpiredException e) {
            throw new AuthenticationException("token已过期：" + e.getMessage());
        } catch (SignatureVerificationException e) {
//            The Token's Signature resulted invalid when verified using the Algorithm: HmacSHA256
            log.error(e.getMessage());
//            throw new AuthenticationException("密码错误！");
            return false;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     *
     * @return token中包含的用户名
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            //无效token 无法解析
            throw new AuthenticationException(e.getMessage());
        }
    }

    /**
     * 生成随机盐
     *
     * @return 随机盐
     */
    public static String getSalt() {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.+-*/()".toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            str.append(chars[new Random().nextInt(chars.length)]);
        }
        return str.toString();
    }
}