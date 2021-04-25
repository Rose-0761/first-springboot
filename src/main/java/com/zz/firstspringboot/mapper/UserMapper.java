package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    void save(User user);

    //在mybatis中传递多个参数需要参数的绑定
    User login(@Param("username") String username, @Param("password") String password);

}
