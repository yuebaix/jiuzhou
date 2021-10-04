package com.yuebaix.jiuzhou.app.bizfacade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UaaFeignClientFallbackFactory implements FallbackFactory<UaaFeignClient> {
    @Override
    public UaaFeignClient create(Throwable cause) {
        return new UaaFeignClient() {
            @Override
            public String appName() {
                log.error("feign error", cause);
                return "uaa-fallback";
            }
        };
    }
}
