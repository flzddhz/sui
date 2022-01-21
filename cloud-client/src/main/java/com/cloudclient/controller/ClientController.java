package com.cloudclient.controller;

import com.cloudclient.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class ClientController {

    public int i = 1;

    @Resource
    private ClientService clientService;

    @RequestMapping("world")
    public String hello(){
        System.out.println("ClientController:   hello  world!");
//        i++;
//        System.out.println(i);
        return "ProController:   hello  world!";
    }

    @GetMapping("/getPro")
    public String getHello(){
        System.out.println("getCliest");
        return clientService.getProduct();
    }
}
