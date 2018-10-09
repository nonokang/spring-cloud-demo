package com.config.client.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomerInfo implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("custom","this is my custom").build();
    }

}
