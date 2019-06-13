package com.xc.mall.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;


/**
 * @author chujian
 * @ClassName MallOrderApplicationConfig
 * @Description 功能描述
 * @date 2019/6/11 13:46
 */

@SpringBootApplication
@EnableEurekaClient
@Configuration
@EnableFeignClients("com.xc.mall.feign") // 开启feign功能,注意注明feign扫描包
@ComponentScan(basePackages = "com.xc.mall")
public class MallOrderApplicationConfig {
}
