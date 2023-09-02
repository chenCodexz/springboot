package com.cxz.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.cxz.service")
public class HelloWorldService {
    @RequestMapping("/getUser")
    public String getUser(){
        return "陈湘钟";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldService.class,args);
    }
}
