package com.instance.mapper.master;

import com.instance.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
//
    int insert(User record);
//
//    int insertSelective(User record);

    User selectByPrimaryKey(@Param("id") Integer id);

//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
    List<User> getUserList();
}