package com.zuul.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动Eureka客户端
public class ZuulClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulClientApplication.class).web(true).run(args);
    }

}
