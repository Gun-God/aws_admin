package cn.timelost.aws.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class StringUtil {

    // 静态变量存储最大值
    private static final AtomicInteger atomicNum = new AtomicInteger();
    private static String nowDate;

    public static synchronized String genNo() {
        SimpleDateFormat sm = new SimpleDateFormat("yyMMdd");
        if (!Objects.equals(nowDate, sm.format(new Date()))) {
            nowDate = sm.format(new Date());
            atomicNum.set(0);
        }
        //生成3位随机数
        String randomNumeric = randomNumeric(3);
        //线程安全的原子操作，所以此方法无需同步
        int newNum = atomicNum.incrementAndGet();
        //数字长度为5位，长度不够数字前面补0
        String newStrNum = String.format("%05d", newNum);
        System.err.println("流水号：" + nowDate + randomNumeric + newStrNum);

        return nowDate + randomNumeric + newStrNum;
    }

    public static String randomNumeric(int len) {
        double v = Math.random() * 9 + 1;
        double pow = Math.pow(10, len - 1);
        int rs = (int) (v * pow);
        return String.valueOf(rs);
    }

}
