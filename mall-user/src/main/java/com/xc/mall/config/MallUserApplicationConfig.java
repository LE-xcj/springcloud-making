package com.xc.mall.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chujian
 * @ClassName MallUserApplicationConfig
 * @Description 功能描述
 * @date 2019/6/9 12:27
 */
@SpringBootApplication
@EnableEurekaClient
@Configuration
@EnableApolloConfig(value = "bigdata.mall-service-common")
@ComponentScan(basePackages = "com.xc.mall")
public class MallUserApplicationConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
    