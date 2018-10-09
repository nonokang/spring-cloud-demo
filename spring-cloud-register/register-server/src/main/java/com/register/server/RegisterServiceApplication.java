package com.register.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动Eureka服务端
@EnableDiscoveryClient
public class RegisterServiceApplication {

    public static void main(String [] args) {
        new SpringApplicationBuilder(RegisterServiceApplication.class).web(true).run(args);
    }

}
