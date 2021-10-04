package com.yuebaix.jiuzhou.app.bizfacade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = BizFacadeConst.SVC_UAA, fallbackFactory = UaaFeignClientFallbackFactory.class)
public interface UaaFeignClient {
    @GetMapping("/demo/appName")
    String appName();
}
