package com.cloudprovider.service;

import com.cloudprovider.entity.Test1;

import java.util.List;

public interface ProService {

    List<Test1> getTestAll();

    String getHelloWorld();
}
