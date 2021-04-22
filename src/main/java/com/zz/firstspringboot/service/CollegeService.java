package com.zz.firstspringboot.service;

import com.zz.firstspringboot.entity.College;

import java.util.List;

public interface CollegeService {
    List<College> findCollAll();
    College findCollByIf(String collegeCode ,String collegeName);
    College updateColl(College college);
    College insertColl(College college);
    College deleteColl(long id);
    List<College> findCollAll(int page ,int pageSize);
}
