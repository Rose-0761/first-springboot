package com.zz.firstspringboot.service;

import com.github.pagehelper.Page;
import com.zz.firstspringboot.entity.Student;

import java.util.List;

public interface StudentServicec {
       Student addStu(Student student);
       void delStu(long id);
       Student uppdataStu(Student student);
       List<Student> findAllStu();
       Student loginBYId(long id , String Stucode);
       Page<Student> findAll(int page  ,int pagesize);
}
