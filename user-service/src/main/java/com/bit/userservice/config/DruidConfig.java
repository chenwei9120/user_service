package com.bit.userservice.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName DruidConfig.java
 * @Description TODO
 * @createTime 2019年11月12日 22:02:00
 */
@Configuration
public class DruidConfig {

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource.druid")
    //@ConfigurationProperties(prefix = "test", locations = "classpath:xxxx.properties")
    public DataSource dataSourceOne(){
        return DruidDataSourceBuilder.create().build();
    }
}