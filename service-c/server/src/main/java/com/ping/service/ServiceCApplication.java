package com.ping.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by liujiangping on 2017/9/16.
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class ServiceCApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCApplication.class, args);
    }
}
