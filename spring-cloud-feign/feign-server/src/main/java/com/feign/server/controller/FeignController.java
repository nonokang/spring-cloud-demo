package com.feign.server.controller;

import com.feign.server.service.SchedualServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private SchedualServiceIndex schedualServiceIndex;

    @GetMapping(value = "/index")
    public String index(@RequestParam String name) {
        return schedualServiceIndex.getIndex( name );
    }

    @GetMapping(value = "/www")
    public String getInfo() {
        return schedualServiceIndex.getIndex( "ben" );
    }

}
