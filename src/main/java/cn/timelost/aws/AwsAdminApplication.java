package cn.timelost.aws;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@MapperScan("cn.timelost.aws.mapper")
@EnableScheduling
public class AwsAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsAdminApplication.class, args);
    }

}
