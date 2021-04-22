package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.College;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeMapper {
    List<College> findCollAll();
    College findCollByIf(@Param("collegeCode")String collegeCode,
                               @Param("collegeName")String collegeName);
    College updateColl(College college);
    College insertColl(College college);
     College deleteColl(long id);



}
