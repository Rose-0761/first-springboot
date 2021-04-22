package com.zz.firstspringboot.service.Impl;

import com.github.pagehelper.PageHelper;
import com.zz.firstspringboot.entity.Student;
import com.zz.firstspringboot.mapper.StudentMapper;
import com.zz.firstspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServcieImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional(propagation=Propagation.SUPPORTS)
    public List<Student> findStuAll() {

        return studentMapper.findStuAll();
    }

    @Override
    public Student findStuByIf(String collegeName, String teamName, String stuCode, String stuName) {

        return studentMapper.findStuByIf(collegeName, teamName, stuCode, stuName);
    }

    @Override
    public Student updateStu(Student student) {

        return studentMapper.updateStu(student);
    }

    @Override
    public Student insertStu(Student student) {
        return studentMapper.insertStu(student);
    }

    @Override
    public Student deleteStu(long id) {
        return studentMapper.deleteStu(id);
    }

    @Override
    public List<Student> findStuAll(int page, int pageSize){
        PageHelper.startPage(page ,pageSize);
        List<Student> typeList = studentMapper.findStuAll();
        return typeList;
    }


}
