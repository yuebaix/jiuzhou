package com.yuebaix.jiuzhou.sys.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@EnableWebFluxSecurity
@EnableDiscoveryClient
@SpringBootApplication
public class GateApp {
    public static void main(String[] args) {
        SpringApplication.run(GateApp.class, args);
    }
}
