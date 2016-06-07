package com.boot.framwork.service;

import java.time.LocalDateTime;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.boot.framwork.entity.UserInfo;

@Service
public class HelloWorldService {

    @Cacheable(value = "print", keyGenerator = "wiselyKeyGenerator")
    public String printHelloWorld() {
        String str = "Hello,World!Here we are.";
        return str;
    }

    @Cacheable(value = "userinfo", keyGenerator = "wiselyKeyGenerator")
    public UserInfo getUserInfo() {
        UserInfo info = new UserInfo();
        info.setUsername("test");
        info.setAge(21);
        info.setMarried(false);
        info.setAccessTime(LocalDateTime.now());

        return info;
    }

}
