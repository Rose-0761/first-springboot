package com.zz.firstspringboot.service.Impl;

import com.zz.firstspringboot.entity.User;
import com.zz.firstspringboot.mapper.UserMapper;
import com.zz.firstspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }
}

