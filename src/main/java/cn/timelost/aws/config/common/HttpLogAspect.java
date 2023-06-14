package cn.timelost.aws.config.common;
import cn.timelost.aws.config.realm.UserRealm;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 监控接口请求
 * @author :hyw
 * @version 1.0
 * @date : 2023/01/25 20:26
 */
@Aspect
@Component
@Slf4j
public class HttpLogAspect {
//    @Autowired
//    UserLogsMapper userLogsMapper;

    private static final ThreadLocal<Long> timeTreadLocal = new ThreadLocal<>();
   // private static UserLogs userLogs = new UserLogs();

    @Pointcut("execution(* cn.timelost.aws.controller..*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void log() {
    }

    @Before("log()")
    public void before(JoinPoint joinPoint) {
        String userName = UserRealm.USERNAME;
        timeTreadLocal.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //获取请求的request
        HttpServletRequest request = attributes.getRequest();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        //获取被拦截的方法
        Method method = methodSignature.getMethod();
        //获取被拦截的方法名
        String methodName = method.getName();
        //System.out.println("接口方法名称：" + methodName + "()");
        //获取所有请求参数key和value
        String keyValue = getReqParameter(request);
       // System.out.println("url = " + request.getRequestURL().toString());

       // System.out.println("方法类型 = " + request.getMethod());
        //System.out.println("请求参数 key：value = " + keyValue);
//        String ip=request.getRemoteAddr();
//        BigInteger ip6=ipv6ToInt(ip);
//        System.err.println(ip6+"----"+ip6.longValue());
//
//        System.err.println("ip6==="+intToIpv6(ip6));
        String ip4=getIpAddr(request);
       // System.out.println("请求ip = " + ip4);
//        userLogs.setUserName(userName);
//        userLogs.setIp(ip4);
//        userLogs.setUrl(request.getRequestURL().toString());
//        userLogs.setMethod(request.getMethod());
//        userLogs.setParams(keyValue);
//        userLogs.setTime(new Date());

    }


    @After("log()")
    public void after() {
      //  System.out.println("aop的after()方法");
    }

    //controller请求结束返回时调用
    @AfterReturning(returning = "result", pointcut = "log()")
    public Object afterReturn(Object result) {
        if (result!=null){
           // System.out.println("返回值result =" + result.toString());
            long startTime = timeTreadLocal.get();
            double callTime = (System.currentTimeMillis() - startTime) / 1000.0;
          //  System.out.println("调用接口共花费时间time = " + callTime + " s");
//            userLogs.setSpendTime(callTime);
//            if (userLogs.getUserName()!=null)
//                userLogsMapper.insert(userLogs);
//            userLogs = new UserLogs();
        }

        return result;
    }

    /**
     * 获取所有请求参数，封装为map对象
     *
     * @return
     */
    public Map<String, Object> getParameterMap(HttpServletRequest request) {
        if (request == null) {
            return null;
        }
        Enumeration<String> enumeration = request.getParameterNames();
        Map<String, Object> parameterMap = new HashMap<String, Object>();
        StringBuilder stringBuilder = new StringBuilder();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String value = request.getParameter(key);
            String keyValue = key + " : " + value + " ; ";
            stringBuilder.append(keyValue);
            parameterMap.put(key, value);
        }
        return parameterMap;
    }

    public String getReqParameter(HttpServletRequest request) {
        if (request == null) {
            return null;
        }
        Enumeration<String> enumeration = request.getParameterNames();
        //StringBuilder stringBuilder = new StringBuilder();
        JSONArray jsonArray = new JSONArray();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String value = request.getParameter(key);
            JSONObject json = new JSONObject();
            json.put(key, value);
            jsonArray.add(json);
        }
        return jsonArray.toString();
    }

//
//    /**long转为ipv4字符串
//     *
//     */
//    public static String longToIp(long l){
//        String ip = "";
//        ip = ip + (l >>> 24);
//        ip = ip + "." +((0x00ffffff & l) >>> 16);
//        ip = ip + "." +((0x0000ffff & l) >>> 8);
//        ip = ip + "." +(0x000000ff & l);
//        return ip;
//    }
//
//    /**ipv6字符串转BigInteger数
//     *
//     */
//    public static BigInteger ipv6ToInt(String ipv6){
//        int compressIndex = ipv6.indexOf("::");
//        if (compressIndex != -1){
//            String part1s = ipv6.substring(0, compressIndex);
//            String part2s = ipv6.substring(compressIndex + 1);
//            BigInteger part1 = ipv6ToInt(part1s);
//            BigInteger part2 = ipv6ToInt(part2s);
//            int part1hasDot = 0;
//            char ch[] = part1s.toCharArray();
//            for(char c : ch){
//                if(c == ':'){
//                    part1hasDot++;
//                }
//            }
//            return part1.shiftLeft(16 * (7 - part1hasDot)).add(part2);
//        }
//        String[] str = ipv6.split(":");
//        BigInteger big = BigInteger.ZERO;
//        for(int i = 0; i < str.length; i++){
//            //::1
//            if(str[i].isEmpty()){
//                str[i] = "0";
//            }
//            big = big.add(BigInteger.valueOf(Long.valueOf(str[i], 16)).shiftLeft(16 * (str.length - i - 1)));
//        }
//        return big;
//    }
//
//    /**BigInteger数 转为ipv6字符串
//     *
//     */
//    public static String intToIpv6(BigInteger big){
//        String str = "";
//        BigInteger ff = BigInteger.valueOf(0xffff);
//        for (int i = 0; i < 8; i++){
//            str = big.and(ff).toString(16) + ":" + str;
//            big = big.shiftRight(16);
//        }
//        //去掉最后的：号
//        str = str.substring(0, str.length() - 1);
//        return str.replaceFirst("(^|:)(0+(:|$)){2,8}", "::");
//    }
    /***
     * 获取客户端IP地址;这里通过了Nginx获取;X-Real-IP
     */
    public static String getIpAddr(HttpServletRequest request) {
        if (request == null) {
            return "unknown";
        }
        String ip = request.getHeader("x-forwarded-for");

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
            if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
                // 多次反向代理后会有多个IP值，第一个为真实IP。
                int index = ip.indexOf(',');
                if (index != -1) {
                    ip =  ip.substring(0, index);
                }
            }
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if("0:0:0:0:0:0:0:1".equals(ip)){
            return "127.0.0.1";
        }else {
            if(ip.equals("127.0.0.1") || ip.equalsIgnoreCase("localhost") && StringUtils.isBlank(request.getRemoteAddr())){
                ip = request.getRemoteAddr();
            }
        }
        return ip;
    }


}


