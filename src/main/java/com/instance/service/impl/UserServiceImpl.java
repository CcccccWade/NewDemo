package com.instance.service.impl;

import com.instance.entity.Grade;
import com.instance.mapper.master.UserMapper;
import com.instance.mapper.master.GradeMapper;
import com.instance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.instance.entity.User;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private GradeMapper gradeMapper;


//    @Override
//    public User getUserById(int userId) {
//
//        User user= userMapper.selectByPrimaryKey(userId);
//
//        Grade grade = gradeMapper.selectByPrimaryKey(userId);
//        user.setGrade(grade);
//        return user;
//    }

//    public boolean addUser(User record){
//        boolean result = false;
//        try {
//            userMapper.insertSelective(record);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return result;
//    }


     @Override
     public int addUser(User record){
        return userMapper.insert(record);

     }
     @Override
     public List<User> getUserList(){



        return userMapper.getUserList();
     }
    @Override
     public int deleteUser(int id){
        return userMapper.deleteByPrimaryKey(id);
     }
     @Override
    public  int insert(Grade record){
        return gradeMapper.insert(record);

     }
      @Override
     public Grade getGradeById(int gradeId){
          return   gradeMapper.selectByPrimaryKey(gradeId);

     }
     @Override
    public int updateGradeById(Grade grade){

        return gradeMapper.updateByPrimaryKey(grade);
     }
}
