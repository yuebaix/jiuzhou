package com.yuebaix.jiuzhou.svc.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UaaApp {
    public static void main(String[] args) {
        SpringApplication.run(UaaApp.class, args);
    }
}
