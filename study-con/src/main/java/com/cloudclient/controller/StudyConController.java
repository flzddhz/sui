package com.cloudclient.controller;

import entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class StudyConController {

//    private static final String REST_URL_PROVIDER_PREFIX = "http://study-pro";
    private static final String REST_URL_PROVIDER_PREFIX = "http://study-pro:8001/getUserAll";

    @Resource
    private RestTemplate restTemplate;//RestTemplate 是一种简单便捷的访问 restful 服务模板类，是 Spring 提供的用于访问 Rest 服务的客户端模板工具集，提供了多种便捷访问远程 HTTP 服务的方法

//    @RequestMapping("getUserAll")
//    public List<User> getUserAll(){
//        return (List<User>) restTemplate.getForEntity(REST_URL_PROVIDER_PREFIX, List.class);
//    }

    @RequestMapping("getUserAll")
    public ResponseEntity<User> getUserAll(){
        return restTemplate.getForEntity(REST_URL_PROVIDER_PREFIX, User.class);
    }
}
