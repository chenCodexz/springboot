package com.cxz.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandler {
    /**
     * 拦截运行异常出现的错误~~~
     *
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<Object, Object> exceptionHandler() {
        Map<Object, Object> map = new HashMap<>();
        map.put("error", "500");
        map.put("msg", "系统出现错误~");
        return map;
    }
}
