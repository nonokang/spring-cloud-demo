package com.register.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //启动Eureka客户端
@RestController
public class RegisterClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RegisterClientApplication.class).web(true).run(args);
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "nihao";
    }

}
