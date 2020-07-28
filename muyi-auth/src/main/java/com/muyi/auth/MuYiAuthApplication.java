package com.muyi.auth;

import com.muyi.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 认证授权中心
 *
 * @author muyi
 */
@EnableRyFeignClients
@SpringCloudApplication
public class MuYiAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(MuYiAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
