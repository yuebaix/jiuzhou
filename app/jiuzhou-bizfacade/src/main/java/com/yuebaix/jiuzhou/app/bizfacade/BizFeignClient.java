package com.yuebaix.jiuzhou.app.bizfacade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = BizFacadeConst.APP_BIZ, fallbackFactory = BizFeignClientFallbackFactory.class)
public interface BizFeignClient {
    @GetMapping("/demo/appName")
    String appName();
}
