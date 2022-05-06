package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 小空
 * @create 2022-05-06 09:51
 * @description Spring核心配置类
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.itheima.service")
@Import({JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {

}
