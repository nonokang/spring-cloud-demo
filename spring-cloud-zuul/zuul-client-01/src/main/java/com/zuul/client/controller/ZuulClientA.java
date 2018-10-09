package com.zuul.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulClientA {

    @Value("spring.application.name")
    private String appName;
    @Value("server.port")
    private String port;

    @RequestMapping(value = "/index")
    public String index(){
        return "appName:"+appName+"\t port:"+port;
    }

}
