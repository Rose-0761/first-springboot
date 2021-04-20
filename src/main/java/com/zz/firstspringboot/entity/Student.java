package com.zz.firstspringboot.entity;


import lombok.Data;


@Data

public class Student {

  private long id;
  private String stuCode;
  private String stuName;
  private String stuSex;
  private String stuAge;
  private long teamId;
  private Team team;
  private College college;

  private  Integer deleted;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getStuCode() {
    return stuCode;
  }

  public void setStuCode(String stuCode) {
    this.stuCode = stuCode;
  }


  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }


  public String getStuSex() {
    return stuSex;
  }

  public void setStuSex(String stuSex) {
    this.stuSex = stuSex;
  }


  public String getStuAge() {
    return stuAge;
  }

  public void setStuAge(String stuAge) {
    this.stuAge = stuAge;
  }



}
