package com.ping.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liujiangping on 2017/9/16.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@RefreshScope
public class ServiceGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceGateWayApplication.class, args);
    }
}
