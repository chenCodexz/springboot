package com.cxz.service.demo1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    @Value("${cxz.name}")
    private String name;
    @Value("${cxz.age}")
    private String age;
    @RequestMapping("/getMember")
    public String getMember(){
        return "陈湘钟";
    }
    @RequestMapping("/getProperties")
    public String getProperties(){
        return name+"--"+age;
    }


}
