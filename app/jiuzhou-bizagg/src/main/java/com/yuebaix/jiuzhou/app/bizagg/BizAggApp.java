package com.yuebaix.jiuzhou.app.bizagg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BizAggApp {
    public static void main(String[] args) {
        SpringApplication.run(BizAggApp.class, args);
    }
}
