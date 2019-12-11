package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Value("${test.name}")
    private String name;

    @Override
    public String sayHello() {
        return "TestService say: "+name;
    }
}
