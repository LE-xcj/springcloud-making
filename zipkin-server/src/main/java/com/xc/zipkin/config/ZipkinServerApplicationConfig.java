package com.xc.zipkin.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author chujian
 * @ClassName ZipkinServerApplicationConfig
 * @Description 功能描述
 * @date 2019/6/17 21:35
 */
@SpringBootApplication
@Configuration
@EnableZipkinServer
public class ZipkinServerApplicationConfig {
}
    