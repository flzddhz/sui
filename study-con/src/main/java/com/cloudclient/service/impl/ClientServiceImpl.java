package com.cloudclient.service.impl;

import com.cloudclient.service.ClientService;
import feign.Client;
import feign.Request;
import feign.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public String getProduct() {
        System.out.println("ClientServiceImpl:   hello  world!");
        return "index";
    }
}
