package com.zz.firstspringboot.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.firstspringboot.FirstSpringbootApplication;
import com.zz.firstspringboot.entity.Student;
import com.zz.firstspringboot.entity.Team;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FirstSpringbootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TeamMapperTest {

    @Autowired
    private TeamMapper teamMapper;
    @Test
    void findTeamAll() {
        List<Team> list = teamMapper.findTeamAll();
        for(Team t: list){
            System.out.println(t); } }
    @Test
    void findTeamById(){
        List<Team> team = teamMapper.findTeamById(2);
        System.out.println(team); }
    @Test
    void findTeamByIf(){
        List<Team> team = teamMapper.findTeamByIf("信息学院","1","信息1班");
        System.out.println(team);
    }
    @Test
    void insertTeam(){
        Team team = new Team();
        team.setTeamCode("7");
        team.setTeamName(":-(");
        team.setCollegeId(8);
        try{
            teamMapper.insertTeam(team);
        }catch (Exception e){

        }System.out.println("输出信息："+team);
    }
    @Test
    void updateTeam(){
        Team team = new Team();
        team.setId(5);
        team.setTeamCode("6");
        team.setTeamName(":-)");
        team.setCollegeId(5);
        try{
            teamMapper.updateTeam(team);
        }catch (Exception e){
        }System.out.println("输出信息："+team); }
    @Test
    public void  deletedTeam(){
        int D = teamMapper.deleteTeam(5);
    }


    @Test
    public void findByPage(){
        //1.执行分页
        PageHelper.startPage(1,5);
        //2.执行查询
        List<Team> list = teamMapper.findTeamAll();
        //3.封装PageInfo对象
        PageInfo<Team> pageInfo = new PageInfo<>(list);
        //4.输出
        for (Team team : pageInfo.getList()){
            System.out.println(team); } }

}