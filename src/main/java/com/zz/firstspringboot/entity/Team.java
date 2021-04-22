package com.zz.firstspringboot.entity;

import lombok.Data;

@Data
public class Team {

  private long id;
  private String teamCode;
  private String teamName;
  private long collegeId;
  private College college;
  private Integer deleted;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTeamCode() {
    return teamCode;
  }

  public void setTeamCode(String teamCode) {
    this.teamCode = teamCode;
  }


  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }




}
