package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.College;
import com.zz.firstspringboot.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;
import java.util.Map;

public interface StudentMapper {

    List<Student> findAll();//✔2021.4.20
    Student findOneById(@Param("id") long id);//✔2021.4.20
    List<Student> findByIf(@Param("stuCode") String stuCode,
                           @Param("stuName") String stuName,
                           @Param("collegeName")String collegeName,
                           @Param("teamName") String teamName);//✔2021.4.20
    Student updateStu(Student student);
    Student insertStu(Student student);
    int deleteStu(long id);

}
