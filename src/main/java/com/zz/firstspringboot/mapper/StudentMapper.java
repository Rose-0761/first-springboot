package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.Student;
import org.apache.ibatis.annotations.Param;


import java.util.List;


public interface StudentMapper {

    List<Student> findStuAll();
   List <Student> findStuById(@Param("id") long id);
    List<Student> findStuByIf(@Param("stuCode") String stuCode,
                           @Param("stuName") String stuName,
                           @Param("collegeName")String collegeName,
                           @Param("teamName") String teamName);
    int updateStu(Student student);
    int insertStu(Student student);
    int deleteStu(long id);

}
