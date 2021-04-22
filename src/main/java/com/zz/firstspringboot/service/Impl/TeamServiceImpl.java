package com.zz.firstspringboot.service.Impl;

import com.github.pagehelper.PageHelper;
import com.zz.firstspringboot.entity.Team;
import com.zz.firstspringboot.mapper.TeamMapper;
import com.zz.firstspringboot.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;
    @Override
    public List<Team> findTeamAll() {
        return teamMapper.findTeamAll();
    }

    @Override
    public Team findTeamById(long id) {
        return teamMapper.findTeamById(id);
    }

    @Override
    public Team findTeamByIf(String collegeName, String teamCode, String teamName) {
        return teamMapper.findTeamByIf(collegeName, teamCode, teamName);
    }

    @Override
    public Team updateTeam(Team team) {
        return teamMapper.updateTeam(team);
    }

    @Override
    public Team insertTeam(Team team) {
        return teamMapper.insertTeam(team);
    }

    @Override
    public Team deleteTeam(long id) {
        return teamMapper.deleteTeam(id);
    }

    @Override
    public List<Team> findTeamAll(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Team> list = teamMapper.findTeamAll();
        return list;
    }
}
