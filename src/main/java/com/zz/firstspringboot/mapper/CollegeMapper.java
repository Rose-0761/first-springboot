package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.College;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollegeMapper {
    List<College> findCollAll();
    List<College> findCollByIf(@Param("collegeCode")String collegeCode,
                               @Param("collegeName")String collegeName);
    int updateColl(College college);
    int insertColl(College college);
     int deleteColl(int id);



}
