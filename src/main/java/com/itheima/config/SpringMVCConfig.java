package com.itheima.config;

import com.itheima.controller.interceptor.SpringInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 小空
 * @create 2022-05-06 09:54
 * @description SpringMVC配置类
 */
@Configuration
@ComponentScan({"com.itheima.controller", "com.itheima.config"})
@EnableWebMvc
public class SpringMVCConfig implements WebMvcConfigurer {
    @Autowired
    private SpringInterceptor interceptor;

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/book", "/book/*");
    }
}
