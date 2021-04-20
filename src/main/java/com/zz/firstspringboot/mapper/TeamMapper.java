package com.zz.firstspringboot.mapper;

import com.zz.firstspringboot.entity.Team;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeamMapper {
    @Select("Select * from team")
    List<Team> findAll();
    @Select("Select * from team where id = #{id}" )
    Team findOneById(@Param("id")long id);
}
