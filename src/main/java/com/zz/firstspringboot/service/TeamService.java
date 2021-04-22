package com.zz.firstspringboot.service;

import com.zz.firstspringboot.entity.Team;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeamService {

    List<Team> findTeamAll();
    Team findTeamById(long id);
    Team findTeamByIf(String collegeName,String teamCode,String teamName);
    Team updateTeam(Team team);
    Team insertTeam(Team team);
    Team deleteTeam(long id);
    List<Team> findTeamAll(int page,int pageSize);
}
