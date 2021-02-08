package com.sjk.knife4j.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * knife4j 配置
 *
 * @Author Lizhou
 */
@Configuration
@EnableSwagger2WebMvc
//@EnableSwagger2
public class Knife4jConfig {
    @Bean
    public Docket createRestApi() {
        //添加head参数start
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("AUTHORIZE_TOKEN")
                .description("令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("swagger-demo")
                .apiInfo(apiInfo())
                //.host(webProperties.getHost())
               /* .globalOperationParameters(Arrays.asList(new ParameterBuilder()
                        .name(Constant.SESSION_TOKEN)
                        .description("用户jwt token")
                        .modelRef(new ModelRef("string"))
                        .parameterType("header")
                        .required(false)
                        .build()))*/
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sjk.knife4j"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot项目 后台服务API接口文档")
                .description("使用 knife4j 搭建的后台服务API接口文档")
                .termsOfServiceUrl("http://127.0.0.1:8080/")
                .contact("sjk")
                .version("1.0.0")
                .build();
    }
}
