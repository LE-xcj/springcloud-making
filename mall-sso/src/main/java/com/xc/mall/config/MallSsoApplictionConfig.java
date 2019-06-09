package com.xc.mall.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chujian
 * @ClassName MallSsoApplictionConfig
 * @Description 功能描述
 * @date 2019/6/9 12:33
 */
@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
@Configuration
@ComponentScan(basePackages = "com.xc.mall")
public class MallSsoApplictionConfig {

    /**
     * 使用RestTemplate一定要加上@LoadBalanced注解
     * 这个注解就是用于负载均衡，同时如果不加，那么在通过应用名来调用其他系统的方法接口时，就会报“UnknownHostName”的错误
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
    