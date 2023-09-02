package com.cxz.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Slf4j
@Component
@ConfigurationProperties(prefix = "cxz")
public class UserEntity {
//    private static Logger log =Logger.getLogger(UserEntity.class);
//    @Getter
//    @Setter
    private String name;
    private Integer age;
    private Integer id;

    public UserEntity(Integer id, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public UserEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public UserEntity() {

    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(25);
        userEntity.setName("haha");
//        System.out.println(userEntity.toString());
        log.info("userEntity"+userEntity.getName());
        log.info("xxx");
    }
}
