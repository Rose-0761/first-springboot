package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.FirstSpringbootApplicationTests;
import com.zz.firstspringboot.entity.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamMapperTest extends FirstSpringbootApplicationTests {

    @Autowired
    private TeamMapper teamMapper;
    @Test
    void findAll() {
        List<Team>  list = teamMapper.findAll();
        for (Team t :list){
            System.out.println(t);
        }
    }

    @Test
    void findOneById() {
        Team team = teamMapper.findOneById(2);
        System.out.println(team);
    }
}