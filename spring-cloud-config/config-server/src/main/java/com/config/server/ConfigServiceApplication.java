package com.config.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer //启动config服务端
@EnableEurekaClient //启动Eureka客户端
public class ConfigServiceApplication {
    /*
    说明：
    输入：http://localhost:8200/user/test进行访问
    http请求地址和资源文件映射如下:
    /{application}/{profile}[/{label}]
    /{application}-{profile}.yml
    /{label}/{application}-{profile}.yml
    /{application}-{profile}.properties
    /{label}/{application}-{profile}.properties
    注意：
    application: 表示微服务的虚拟主机名，即配置的spring.application.name
    profile: 表示当前的环境，dev,test or production?
    label: 表示git仓库分支，master or relase or others repository name?默认是master
    */
    public static void main(String[] args) {
//        SpringApplication.run(ConfigServerApplication.class, args);   //同时使用EnableConfigServer和EnableEurekaClient情况下，使用此方法，EnableEurekaClient注解不起作用
        new SpringApplicationBuilder(ConfigServiceApplication.class).web(true).run(args);
    }
}
