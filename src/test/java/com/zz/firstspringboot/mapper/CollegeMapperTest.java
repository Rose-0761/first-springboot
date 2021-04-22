package com.zz.firstspringboot.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.firstspringboot.FirstSpringbootApplication;
import com.zz.firstspringboot.entity.College;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class CollegeMapperTest  {


    @Autowired
   private CollegeMapper collegemapper;

    @Test
    void findCollAll(){
        List<College> list = collegemapper.findCollAll();
        for (College college:list){
            System.out.println(college); } }
    @Test
    void findCollByIf(){
       College list = collegemapper.findCollByIf("2","工程学院");
       System.out.println(list); }

    @Test
    void insertColl(){
        College college = new College();
        college.setCollegeCode("7");
        college.setCollegeName("GGG");
        try{
             collegemapper.insertColl(college);
        }catch (Exception e){ }
        System.out.println("输入信息："+college);}
    @Test
    void updateColl() {
        College college = new College();
        college.setId(6);
        college.setCollegeCode("6");
        college.setCollegeName(":-D");
        try{
            collegemapper.updateColl(college);
        }catch (Exception e){

        }
        System.out.println("输出信息："+college);
    }

    @Test
    void deleteColl(){
        College D = collegemapper.deleteColl(5); }


    @Test
    public void findByPage(){
        //1.执行分页
        PageHelper.startPage(1,5);
        //2.执行查询
        List<College> list = collegemapper.findCollAll();
        //3.封装PageInfo对象
        PageInfo<College> pageInfo = new PageInfo<>(list);
        //4.输出
        for (College college : pageInfo.getList()){
            System.out.println(college); } }
}