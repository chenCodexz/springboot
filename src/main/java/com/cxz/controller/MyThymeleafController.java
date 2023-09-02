package com.cxz.controller;

import com.cxz.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class MyThymeleafController {
    @RequestMapping("/myThymeleaf")
    public String myThymeleaf(HttpServletRequest request, Map<String,Object> result){
//        request.setAttribute("user",new UserEntity("cxz",26));
        result.put("user",new UserEntity("cxz",26));
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("wumaosan",18));
        userEntities.add(new UserEntity("litinglin",19));
        userEntities.add(new UserEntity("chujinge",20));
        result.put("userEntities",userEntities);
        return "myThymeleaf";
    }
}
