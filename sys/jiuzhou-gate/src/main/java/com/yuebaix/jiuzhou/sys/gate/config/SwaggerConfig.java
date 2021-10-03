package com.yuebaix.jiuzhou.sys.gate.config;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
@Slf4j
public class SwaggerConfig {
    @Bean("DefaultDocket")
    @ConditionalOnMissingBean(Docket.class)
    public Docket defaultDocket() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("default")
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                //.pathMapping(socialGraphServiceProperties.getContextPath())
                .select()
                //扫描注解了@ApiOperation的方法生成API接口文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("ApiDoc")
                .contact(new Contact("yuebaix", "https://github.com/yuebaix", "yuebaix@outlook.com"))
                .version("1.0.0")
                .description("ApiDoc generated by jiuzhou")
                .build();
    }
}
