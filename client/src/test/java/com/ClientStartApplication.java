package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 孔垂云 on 2018/7/22.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientStartApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientStartApplication.class).web(true).run(args);
    }

}
