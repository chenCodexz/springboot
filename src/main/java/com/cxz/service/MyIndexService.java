package com.cxz.service;

import com.cxz.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyIndexService {
    @Value("${cxz.name}")
    private String name;
    @Value("${cxz.age}")
    private String age;

    @Autowired
    private UserEntity userEntity;

    @RequestMapping("/getAll")
    public String getAll(){
        System.out.println(name+","+age);
        log.info("name:{},age:{}",name,age);
        return name+","+age;
    }
    @RequestMapping("/getNameAndAge")
    public String getNameAndAge(String name,int age){
        System.out.println(name+","+age);
//        log.info("name:{},age:{}",name,age);
//        log.debug("xixi");
//        try{
//        }catch (Exception e){
//            log.error("haha");
//        }
        return name+","+age;
    }
    @RequestMapping("/getUserAll")
    public String getUserAll(){
        System.out.println(userEntity);
        return userEntity.toString();
    }

    public static void main(String[] args) {
        new MyIndexService().getAll();
    }
}
