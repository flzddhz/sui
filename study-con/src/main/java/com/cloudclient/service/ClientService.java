package com.cloudclient.service;

import com.cloudclient.service.impl.ClientServiceImpl;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
//@FeignClient("cloud-provider")    //@FeignClient的value对应的是你要调用的服务的spring application name（应用的名称）
public interface ClientService {

    @RequestMapping("/getProduct")
    String getProduct();
}
