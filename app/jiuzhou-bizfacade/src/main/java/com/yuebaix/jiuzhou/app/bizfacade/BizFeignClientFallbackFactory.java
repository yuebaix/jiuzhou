package com.yuebaix.jiuzhou.app.bizfacade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BizFeignClientFallbackFactory implements FallbackFactory<BizFeignClient> {
    @Override
    public BizFeignClient create(Throwable cause) {
        return new BizFeignClient() {
            @Override
            public String appName() {
                log.error("feign error", cause);
                return "biz-fallback";
            }
        };
    }
}
