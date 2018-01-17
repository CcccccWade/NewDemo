package com.instance.service;

import com.instance.entity.Grade;
import com.instance.entity.User;
import java.util.List;
import java.util.Map;

public interface UserService {
//    public User getUserById(int userId);

   // boolean addUser(User record);
    int addUser(User record);
    public List<User> getUserList();
    public int deleteUser(int id);
    public int insert(Grade record);
    public  Grade getGradeById(int gradeId);
    public  int updateGradeById(Grade grade);
}
