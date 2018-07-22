package com.cars.controller;

/**
 * Created by 孔垂云 on 2018/7/22.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private Registration registration;// 服务注册
    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/hello")
    public String index(){
        List<ServiceInstance> instances = client.getInstances(registration.getServiceId());
        if (instances != null && instances.size() > 0) {
            System.out.println("/hello,host:" + instances.get(0).getHost()+", service_id:"+instances.get(0).getServiceId());
        }
        return "hello,provider";
    }
}
