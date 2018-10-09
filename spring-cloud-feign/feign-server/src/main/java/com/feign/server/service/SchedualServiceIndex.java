package com.feign.server.service;

import com.feign.server.config.AuthConfiguration;
import com.feign.server.fallback.SchedualServiceIndexHystrics;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feign-client", configuration=AuthConfiguration.class, fallback=SchedualServiceIndexHystrics.class)
public interface SchedualServiceIndex {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String getIndex(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    String getInfo();
}
