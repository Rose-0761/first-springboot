package com.zz.firstspringboot.service;

import com.github.pagehelper.Page;
import com.zz.firstspringboot.entity.Student;


import java.util.List;


public interface StudentService {
List<Student> findStuAll();
Student findStuByIf(String collegeName,String teamName,String stuCode,String stuName);
Student updateStu(Student student);
Student insertStu(Student student);
Student deleteStu(long id);
List<Student> findStuAll( int page,int pageSize);
}
