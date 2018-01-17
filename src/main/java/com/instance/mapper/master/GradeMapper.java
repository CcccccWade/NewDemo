package com.instance.mapper.master;

import com.instance.entity.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



public interface GradeMapper {
//    int deleteByPrimaryKey(Integer id);
//
      int insert(Grade record);
//
//    int insertSelective(Grade record);

      Grade selectByPrimaryKey(@Param("id") Integer id);

//    int updateByPrimaryKeySelective(Grade record);

      int updateByPrimaryKey(Grade grade);
}