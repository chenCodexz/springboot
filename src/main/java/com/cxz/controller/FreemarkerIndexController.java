package com.cxz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class FreemarkerIndexController {
    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<String,Object> result){
        result.put("name","陈湘钟");
        result.put("age",26);
        result.put("sex","0");
        ArrayList<String> lists = new ArrayList<>();
        lists.add("wumaosan");
        lists.add("chuxiaowei");
        result.put("userList",lists);
        return "freemarkerIndex";
    }
}
