package com.yuebaix.jiuzhou.app.bizfacade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BizAggFeignClientFallbackFactory implements FallbackFactory<BizAggFeignClient> {
    @Override
    public BizAggFeignClient create(Throwable cause) {
        return new BizAggFeignClient() {
            @Override
            public String appName() {
                log.error("feign error", cause);
                return "bizagg-fallback";
            }
        };
    }
}
