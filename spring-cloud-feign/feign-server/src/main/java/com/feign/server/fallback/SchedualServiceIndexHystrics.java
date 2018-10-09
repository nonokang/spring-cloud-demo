package com.feign.server.fallback;

import com.feign.server.service.SchedualServiceIndex;
import org.springframework.stereotype.Component;

/**
 * 断路器
 */
@Component
public class SchedualServiceIndexHystrics implements SchedualServiceIndex {

    @Override
    public String getIndex(String name) {
        return "访问失败！";
    }

    @Override
    public String getInfo() {
        return "请求失败！";
    }

}
