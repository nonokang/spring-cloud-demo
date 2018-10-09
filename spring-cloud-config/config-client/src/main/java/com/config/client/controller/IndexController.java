package com.config.client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {

    @Value("${test.name}")
    String foo;
    @RequestMapping(value = "/index")
    public String index(){
        return foo;
    }
}
