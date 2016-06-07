package com.boot.framwork.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.framwork.entity.UserInfo;
import com.boot.framwork.service.HelloWorldService;

@RestController
public class HelloWorldEndpoint {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/index")
    public String printHelloWorld() {
        return helloWorldService.printHelloWorld();
    }

    @RequestMapping(value = "/get")
    public UserInfo getUserInfo() {
        return helloWorldService.getUserInfo();
    }
}
