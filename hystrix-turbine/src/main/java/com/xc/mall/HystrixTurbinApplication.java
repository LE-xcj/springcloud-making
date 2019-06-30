package com.xc.mall;

import com.xc.mall.config.HystrixTurbinApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class HystrixTurbinApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbinApplicationConfig.class, args);
	}

}
