package com.xc.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chujian
 * @ClassName MyBatisConfig
 * @Description 功能描述
 * @date 2019/6/9 12:27
 */
@Configuration
@MapperScan("com.xc.mall.mapper")
public class MyBatisConfig {
}
    