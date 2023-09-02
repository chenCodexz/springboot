package com.cxz.service;

import com.cxz.entity.User;
import com.cxz.entity.UserEntity;
import com.cxz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insertUser")
    public String insertUser(String userName, Integer age) {
        int update = jdbcTemplate.update("insert into users values(null,?,?);", userName, age);
        return update > 0 ? "success" : "fail";
    }

    @RequestMapping("/mybatisFindById")
    public UserEntity mybatisFindById(Integer id) {
        return userMapper.selectByUserId(id);
    }

    @RequestMapping("/insertUserMybatis")
    public String insertUserMybatis(String userName, Integer age) {
        int result = userMapper.insertUser(userName, age);
        return result > 0 ? "success" : "fail";
    }

    @RequestMapping("/loginUserName")
    @CrossOrigin
    public String loginUserName(String userName,String password) {
        User user = userMapper.loginUserName(userName, password);
        return user!=null ? "success" : "fail";
    }
}
