package com.muyi.gen;

import com.muyi.common.security.annotation.EnableCustomConfig;
import com.muyi.common.security.annotation.EnableRyFeignClients;
import com.muyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 代码生成
 *
 * @author muyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class MuYiGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(MuYiGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞn");
    }
}
