package com.muyi.system;

import com.muyi.common.security.annotation.EnableCustomConfig;
import com.muyi.common.security.annotation.EnableRyFeignClients;
import com.muyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 系统模块
 *
 * @author muyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class MuYiSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MuYiSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
