package com.xc.mall.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chujian
 * @ClassName MallItemApplicationConfig
 * @Description 功能描述
 * @date 2019/6/11 16:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig(value = "bigdata.mall-service-common")
@Configuration
@ComponentScan(basePackages = "com.xc.mall")
public class MallItemApplicationConfig {
}
    