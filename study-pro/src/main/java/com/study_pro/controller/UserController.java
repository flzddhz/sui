package com.study_pro.controller;

import com.study_pro.service.UserService;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private DiscoveryClient client;
    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("/getUserAll")
    public List<User> getUserAll(){
        return userService.getUserAll();
    }


}
