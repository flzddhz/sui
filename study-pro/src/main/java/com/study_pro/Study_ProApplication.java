package com.study_pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@MapperScan("com.study_pro.mapper")    //与@Mapper  取其一
public class Study_ProApplication {

    public static void main(String[] args) {
        SpringApplication.run(Study_ProApplication.class, args);
    }

}
