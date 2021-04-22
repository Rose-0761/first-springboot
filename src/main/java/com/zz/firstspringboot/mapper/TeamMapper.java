package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.Team;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeamMapper {
    List<Team> findTeamAll();
    List<Team> findTeamById(@Param("id")long id);
    List<Team> findTeamByIf(@Param("collegeName") String collegeName,
                      @Param("teamCode")String teamCode,
                      @Param("teamName")String teamName);
    int updateTeam(Team team);
    int insertTeam(Team team);
    int deleteTeam(long id);
}
