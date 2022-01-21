package com.cloudprovider.controller;

import com.cloudprovider.entity.Test1;
import com.cloudprovider.service.ProService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/hello")
@RestController
public class ProController {

    @Resource
    private ProService proService;

    @RequestMapping("/getHello")
    public String hello(){
        System.out.println("ProController:   hello  world!");
        return proService.getHelloWorld();
    }

    @RequestMapping("world")
//    @GetMapping("world")
    public String world(){
        System.out.println("ProController:   hello  world!");
        return "index";
    }

//    @RequestMapping("test")
//    public String Test(HttpServletRequest request){
//        List<Test1> list =  proService.getTestAll();
//        System.out.println("oracle连接成功");
//        request.setAttribute("list",list);
//        return "test";
//    }
}
