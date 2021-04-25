package com.zz.firstspringboot.controller;


import com.zz.firstspringboot.entity.Student;
import com.zz.firstspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findStuAll")
    public String findStuAll(Model model){
        List<Student> Stu= studentService.findStuAll();
        model.addAttribute("Stu"+Stu);
        return  "Student/Stulist";
    }




}
