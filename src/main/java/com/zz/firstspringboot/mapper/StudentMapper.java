package com.zz.firstspringboot.mapper;

import com.github.pagehelper.Page;
import com.zz.firstspringboot.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface StudentMapper {

    List<Student> findStuAll();
    Student findStuById(@Param("id") long id);
    Student findStuByIf(@Param("stuCode") String stuCode,
                           @Param("stuName") String stuName,
                           @Param("collegeName")String collegeName,
                           @Param("teamName") String teamName);
    Student updateStu(Student student);
    Student insertStu(Student student);
    Student  deleteStu(long id);
}
