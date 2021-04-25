package com.zz.firstspringboot.service;


import com.zz.firstspringboot.entity.User;

public interface  UserService {
    void register(User user);

    User login(String username, String password);
}
