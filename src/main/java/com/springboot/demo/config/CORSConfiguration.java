package com.springboot.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 允许跨域访问(此处的意思就是,首先通过一个控制器获取页面,但数据还没有获取到,然后通过vue向服务器再次发起请求,获取到数据
 * )此配置的作用就是,异步请求时不会获取不到数据
 * @author Administrator
 *
 */

@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域访问
        registry.addMapping("/**").
                allowedOrigins("*").
                allowedMethods("*").
                allowedHeaders("*");
    }
}
