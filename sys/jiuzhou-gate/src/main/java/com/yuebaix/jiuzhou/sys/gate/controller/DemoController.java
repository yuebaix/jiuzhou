package com.yuebaix.jiuzhou.sys.gate.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.reactive.ServerWebExchangeContextFilter;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Api(tags = "示例接口")
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Value("${spring.application.name}")
    private String appName;

    @Bean
    public ServerWebExchangeContextFilter serverWebExchangeContextFilter() {
        return new ServerWebExchangeContextFilter();
    }

    @ApiOperation("服务名称")
    @GetMapping("/appName")
    public Mono<String> appName() {
        return Mono.subscriberContext().map(ctx -> {
            ServerWebExchange exchange = ServerWebExchangeContextFilter.get(ctx).get();
            String authorization = exchange.getRequest().getHeaders().getFirst("Authorization");
            log.info(authorization);
            return appName;
        });
    }
}
