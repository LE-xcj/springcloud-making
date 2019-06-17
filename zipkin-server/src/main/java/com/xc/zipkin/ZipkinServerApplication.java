package com.xc.zipkin;

import com.xc.zipkin.config.ZipkinServerApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplicationConfig.class, args);
	}

}
