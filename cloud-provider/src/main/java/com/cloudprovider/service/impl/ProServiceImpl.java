package com.cloudprovider.service.impl;

import com.cloudprovider.dao.ProMapper;
import com.cloudprovider.entity.Test1;
import com.cloudprovider.service.ProService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProServiceImpl implements ProService {

    @Resource
    private ProMapper proMapper;

    @Override
    public List<Test1> getTestAll() {
        return proMapper.getTestAll();
    }

    @Override
    public String getHelloWorld() {
        System.out.println("ProService:   hello  world!");
        return "你好兄弟";
    }
}
