package com.sjk.knife4j.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 注册拦截器
 *
 * @Author sjk
 **/
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       /* InterceptorRegistration ir = registry.addInterceptor(loginHandlerInterceptor);
        // 拦截路径
        registry.addPathPatterns("/*");
        // 不拦截路径
        List<String> irs = new ArrayList<String>();
        irs.add("/login");
        irs.add("/api/*");
        // 开放knife4j
        irs.add("/doc.html");
        irs.add("/service-worker.js");
        irs.add("/swagger-resources");
        ir.excludePathPatterns(irs);*/
    }
}
