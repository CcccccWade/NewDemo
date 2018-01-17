package com.instance.service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.instance.entity.User;
import com.instance.service.UserService;

public class UserServiceTest  {

    @Autowired
    private UserService userService;

//    @Test
//    public void selectUserByIdTest(){
//        User user = userService.getUserById(1);
//        System.out.println(user.getUserName() + ":" + user.getPassword()+" age is "+user.getAge());
//    }
}