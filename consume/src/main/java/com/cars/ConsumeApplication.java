package com.cars;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 孔垂云 on 2018/7/22.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumeApplication {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumeApplication.class).web(true).run(args);
    }

}