package com.zz.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping( "/")
    public String toIndex() {
        return "signin";
    }

    @GetMapping( "/toRegist")
    public String toRegister() {
        return "regist";
    }

    @GetMapping( "toSave")
    public String toSave() {
        return "mian";
    }
}
