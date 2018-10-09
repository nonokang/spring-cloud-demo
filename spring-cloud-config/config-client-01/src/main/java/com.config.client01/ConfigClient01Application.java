package com.config.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动Eureka客户端
@EnableDiscoveryClient
@RefreshScope
public class ConfigClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient01Application.class, args);
    }

}
