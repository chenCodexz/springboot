package com.cxz.mapper;

import com.cxz.entity.User;
import com.cxz.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into users values(null,#{name},#{age})")
    int insertUser(@Param("name") String userName,@Param("age") Integer age);

    @Select("select * from users where id=#{id}")
    UserEntity selectByUserId(@Param("id")Integer id);

    @Select("select * from userdata where userName=#{name} and password=#{password}")
    User loginUserName(@Param("name")String name, @Param("password")String password);

}
