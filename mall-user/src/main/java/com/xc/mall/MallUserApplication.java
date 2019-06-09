package com.xc.mall;

import com.xc.mall.config.MallUserApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


public class MallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallUserApplicationConfig.class, args);
	}

}
