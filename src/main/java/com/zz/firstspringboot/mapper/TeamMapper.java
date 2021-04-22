package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.Team;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeamMapper {
    List<Team> findTeamAll();
    Team findTeamById(@Param("id")long id);
    Team findTeamByIf(@Param("collegeName") String collegeName,
                      @Param("teamCode")String teamCode,
                      @Param("teamName")String teamName);
    Team updateTeam(Team team);
    Team insertTeam(Team team);
    Team deleteTeam(long id);
}
