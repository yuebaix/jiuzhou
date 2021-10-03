package com.yuebaix.jiuzhou.app.bizclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BizClientApp {
    public static void main(String[] args) {
        SpringApplication.run(BizClientApp.class, args);
    }
}
