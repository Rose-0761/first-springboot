package com.zz.firstspringboot.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.firstspringboot.FirstSpringbootApplicationTests;
import com.zz.firstspringboot.entity.College;
import com.zz.firstspringboot.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapperTest extends FirstSpringbootApplicationTests {

    @Autowired
    private StudentMapper studentMapper;
    @Test
    void findAll() {
        List<Student> list =studentMapper.findAll();
        for (Student s: list){
            System.out.println(s); } }
    @Test
    void findOneById(){
       Student student = studentMapper.findOneById(7);
        System.out.println(student);
    }
    @Test
    void findByIf(){
    List<Student> students = studentMapper.findByIf("7777","BBB");
    System.out.println(students);
    }

    @Test
    public void updateStu(){
        Student student = new Student();
        student.setId(7);
        student.setStuName("BBB");
        student.setStuAge("15");
        student.setStuSex("女");
        student.setStuCode("7777");
        student.setTeamId(2);
        try
        { studentMapper.updateStu(student);
        }catch (Exception e){ }
        System.out.println("输出信息：" +student); }
    @Test
    public void insertStu() {
        Student student = new Student();
        student.setStuName("BBB");
        student.setStuAge("14");
        student.setStuSex("女");
        student.setStuCode("7777");
        student.setTeamId(2);
        try
        {
            studentMapper.insertStu(student);
        }catch (Exception e){ }
        System.out.println("输出信息：" +student); }
    @Test
    public void  deletedStu(){
        int D = studentMapper.deleteStu(6);
    }

    @Test
    public void findByPage(){
        //1.执行分页
        PageHelper.startPage(1,5);
        //2.执行查询
        List<Student> list = studentMapper.findAll();
        //3.封装PageInfo对象
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        //4.输出
        for (Student student : pageInfo.getList()){
            System.out.println(student); } }
}


