package com.yuebaix.jiuzhou.app.biz.controller;

import com.yuebaix.jiuzhou.app.bizfacade.BizFeignClient;
import com.yuebaix.jiuzhou.app.bizfacade.UaaFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "示例接口")
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Value("${spring.application.name}")
    private String appName;
    @Autowired
    private UaaFeignClient uaaFeignClient;

    @ApiOperation("服务名称")
    @GetMapping("/appName")
    public String appName() {
        return appName;
    }

    @ApiOperation("调用svc-uaa")
    @GetMapping("/callSvcUaa")
    public String callSvcUaa() {
        return uaaFeignClient.appName();
    }
}
