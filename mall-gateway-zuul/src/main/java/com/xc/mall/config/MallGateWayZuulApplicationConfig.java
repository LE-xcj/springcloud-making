package com.xc.mall.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chujian
 * @ClassName MallGateWayZuulApplicationConfig
 * @Description 功能描述
 * @date 2019/6/9 22:55
 */
@SpringBootApplication
@EnableZuulProxy    // 启动网关
@EnableEurekaClient
@Configuration
@ComponentScan("com.xc.mall")
public class MallGateWayZuulApplicationConfig {
}

