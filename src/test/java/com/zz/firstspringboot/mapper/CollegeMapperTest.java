package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.FirstSpringbootApplicationTests;
import com.zz.firstspringboot.entity.College;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollegeMapperTest extends FirstSpringbootApplicationTests {


    @Autowired
   private CollegeMapper mapper;

    @Test
    void findAll(){
        List<College> list = mapper.findAll();
        for (College college:list){
            System.out.println(college);
        }
    }

    @Test
    void findOneById(){
       College college = mapper.findOneById(2);
       System.out.println(college);
    }


}