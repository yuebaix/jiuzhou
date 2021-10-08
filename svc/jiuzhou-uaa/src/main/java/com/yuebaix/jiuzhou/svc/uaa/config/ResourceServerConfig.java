package com.yuebaix.jiuzhou.svc.uaa.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    private final ResourceServerProperties resource;

    public ResourceServerConfig(ResourceServerProperties resource) {
        this.resource = resource;
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(this.resource.getResourceId());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/user/userInfo").authorizeRequests()
                .anyRequest().authenticated();
    }
}
