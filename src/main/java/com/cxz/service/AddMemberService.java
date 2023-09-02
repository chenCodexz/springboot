package com.cxz.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AddMemberService {
    @Autowired
    private MemberServiceAsync memberServiceAsync;
    @RequestMapping("/addMember")
    public String addMember(){
        System.out.println("hahaha");
        log.info(">01<");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                sms();
//            }
//        }).start();
        memberServiceAsync.sms();
        log.info(">04<");
        return "用户注册成功";
    }

}
