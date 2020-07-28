package com.muyi.job;

import com.muyi.common.security.annotation.EnableCustomConfig;
import com.muyi.common.security.annotation.EnableRyFeignClients;
import com.muyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 定时任务
 *
 * @author muyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class MuYiJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(MuYiJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
