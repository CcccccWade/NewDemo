package com.instance.entity;

import org.apache.ibatis.annotations.Mapper;


public class Grade {
    private Integer id;

    private Integer maths;

    private Integer english;

    private Integer science;

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }
}