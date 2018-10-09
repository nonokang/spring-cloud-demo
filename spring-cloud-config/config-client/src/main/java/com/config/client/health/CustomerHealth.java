package com.config.client.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class CustomerHealth implements HealthIndicator {
    private static Logger logger = LoggerFactory.getLogger(CustomerHealth.class);

    /*public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
        logger.info("My Spring Boot Application Started");
    }*/

    /**
     * 在/health接口调用的时候，返回多一个属性："mySpringBootApplication":{"status":"UP","hello":"world"}
     */
    @Override
    public Health health() {
        return Health.up().withDetail("hello", "world").build();
    }

}
