package com.boot.framwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SBootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SBootApplication.class, args);
    }
}
