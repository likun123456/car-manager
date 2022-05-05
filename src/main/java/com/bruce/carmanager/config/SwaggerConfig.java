package com.bruce.carmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 10
 **/
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors配置扫描接口的方式（还有any，none等），
                //basePackage：指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.bruce.carmanager.controller"))
                .paths(PathSelectors.ant("/Hello/hello*"))  //url过滤
                .build();
    }

    //配置swagger-ui.html的页面信息
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "jarvis的Swagger-Api文档",
                "感受冥族十万年的怒火吧~~永恒之夜！",
                "v1.0",
                "urn:tos",
                new Contact("jarvis", "https://blog.csdn.net/weixin_43283513", "jarvis314159@gmail.com"),  //作者信息
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}
