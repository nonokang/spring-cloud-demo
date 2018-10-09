package com.config.client01.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${wpkname}")
    String foo;
    @RequestMapping(value = "/index")
    public String index(){
        return foo;
    }
}
