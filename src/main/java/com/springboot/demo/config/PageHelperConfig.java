package com.springboot.demo.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 分页支持配置 此种方法直接就可以分页,不需要数据库里采用limit
 * @author wuqianhui
 *
 */
@Configuration
public class PageHelperConfig {
 
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");    //offsetAsPageNum:设置为true时，会将RowBounds第一个参数offset当成pageNum页码使用.
        p.setProperty("rowBoundsWithCount", "true");	//rowBoundsWithCount:设置为true时，使用RowBounds分页会进行count查询.
        p.setProperty("reasonable", "true");    //启用合理化时，如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页。
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
