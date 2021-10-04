package com.yuebaix.jiuzhou.app.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.yuebaix.jiuzhou.app.bizfacade")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.yuebaix.jiuzhou")
public class BizApp {
    public static void main(String[] args) {
        SpringApplication.run(BizApp.class, args);
    }
}
