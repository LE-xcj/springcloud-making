package com.xc.mall.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.*;


/**
 * @author chujian
 * @ClassName MallOrderApplicationConfig
 * @Description 功能描述
 * @date 2019/6/11 13:46
 */

@Configuration
@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig(value = "bigdata.mall-service-common")      // 声明引用的namespace
@EnableFeignClients("com.xc.mall.feign") // 开启feign功能,注意注明feign扫描包
@ComponentScan(basePackages = "com.xc.mall")
@Import(value = {Swagger2Config.class})
public class MallOrderApplicationConfig {
}
