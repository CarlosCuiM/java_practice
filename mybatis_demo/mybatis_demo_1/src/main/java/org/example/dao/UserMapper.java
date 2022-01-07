package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
//    @Select("select * from user")
    List<User> getUserList();

//    @Select("select * from user where id=#{id}")

    //jdbc -> \= object
    // jdbc-  -> user
    User findUserById(int id);

}
//dao:data access object