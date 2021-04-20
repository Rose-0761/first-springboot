package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.College;
import com.zz.firstspringboot.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;
import java.util.Map;

public interface StudentMapper {

    List<Student> findAll();

    List<Student> findByIf(@Param("stuCode") String stuCode,
                           @Param("stuName") String stuName);


    @Select("Select * from student where id =#{id}")
    Student findOneById(@Param("id") long id);

    Student updateStu(Student student);

    Student insertStu(Student student);

    int deleteStu(long id);

}
