package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.College;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

import java.util.List;

public interface CollegeMapper {

   @Select("Select * from college")
    List<College> findAll();

   @Select("Select * from college where id =#{id}")
   College findOneById(@Param("id")long id);



}
