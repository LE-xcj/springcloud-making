package com.xc.mall;

import com.xc.mall.config.MallSsoApplictionConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class MallSsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallSsoApplictionConfig.class, args);
	}

}
