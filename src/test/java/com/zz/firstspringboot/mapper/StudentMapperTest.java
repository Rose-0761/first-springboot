package com.zz.firstspringboot.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.firstspringboot.entity.Student;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentMapperTest  {

    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void findStuAll() {
        List<Student> list =studentMapper.findStuAll();
        for (Student s : list){
            System.out.println(s);}}
    @Test
    public void findStuById(){
        Student student = studentMapper.findStuById(5);
        System.out.println(student);
    }
    @Test
    public void findStuByIf(){
       Student students = studentMapper.findStuByIf("5555","迪奥","科技学院","科技1班");
        System.out.println(students);
    }

    @Test
    public void updateStu() {
        Student student = new Student();
        student.setId(7);
        student.setStuCode("7777");
        student.setStuName("BBB");
        student.setStuSex("女");
        student.setStuAge("14");
        student.setTeamId(1);
        try { studentMapper.updateStu(student);
        }catch (Exception e){ }
        System.out.println("输出信息："+student);
    }

    @Test
    public void insertStu() {
        Student student = new Student();
        student.setStuCode("9999");
        student.setStuName(":))");
        student.setStuSex("男");
        student.setStuAge("3");
        student.setTeamId(3);
        try{
            studentMapper.insertStu(student);
        }catch (Exception e){
        }System.out.println("输出信息："+student);
    }


    @Test
    public void  deletedStu(){
        Student D = studentMapper.deleteStu(7);
    }


    @Test
    public void findByPage(){
        //1.执行分页
        PageHelper.startPage(1,5);
        //2.执行查询
        List<Student> list = studentMapper.findStuAll();
        //3.封装PageInfo对象
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        //4.输出
        for (Student student : pageInfo.getList()){
            System.out.println(student); } }
}


