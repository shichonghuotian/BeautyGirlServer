package com.moon.girl.dao;

import com.moon.girl.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("Select * from Accounts")
    List<User> getAll();
}
