package com.xc.mall.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * @author chujian
 * @ClassName HystrixTurbinApplicationConfig
 * @Description 功能描述
 * @date 2019/6/30 18:10
 */
@Configuration
@SpringBootApplication
@EnableTurbine      // 开启turbine
@EnableHystrixDashboard     // 开启Hystrix仪表盘
@EnableCircuitBreaker
public class HystrixTurbinApplicationConfig {
}
    