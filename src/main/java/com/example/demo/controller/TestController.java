package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("test method income");
        String name = testService.sayHello();
        return name;
    }
}
