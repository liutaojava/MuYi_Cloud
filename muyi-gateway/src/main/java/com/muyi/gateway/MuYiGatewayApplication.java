package com.muyi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关启动程序
 *
 * @author muyi
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MuYiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MuYiGatewayApplication.class, args);
        System.out.println("沐依网关启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}