package com.zz.firstspringboot.controller;

import com.zz.firstspringboot.entity.User;
import com.zz.firstspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
    public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(User user) {
            userService.register(user);
      return "redirect:/";
    }

    @PostMapping(value = "/login")
    public String login(String username, String password) {
        User login = userService.login(username, password);
        if (login != null) {
            return "main";
        } else {
            return "redirect:/";
        }
    }

}