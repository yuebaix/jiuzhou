package com.yuebaix.jiuzhou.app.bizfacade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = BizFacadeConst.APP_BIZAGG, fallbackFactory = BizAggFeignClientFallbackFactory.class)
public interface BizAggFeignClient {
    @GetMapping("/demo/appName")
    String appName();
}
