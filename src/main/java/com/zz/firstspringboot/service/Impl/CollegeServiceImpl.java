package com.zz.firstspringboot.service.Impl;

import com.github.pagehelper.PageHelper;
import com.zz.firstspringboot.entity.College;
import com.zz.firstspringboot.mapper.CollegeMapper;
import com.zz.firstspringboot.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeMapper collegeMapper;
    @Override
    public List<College> findCollAll() {
        return collegeMapper.findCollAll();
    }

    @Override
    public College findCollByIf(String collegeCode, String collegeName) {
        return collegeMapper.findCollByIf(collegeCode, collegeName);
    }

    @Override
    public College updateColl(College college) {
        return collegeMapper.updateColl(college);
    }

    @Override
    public College insertColl(College college) {
        return collegeMapper.insertColl(college);
    }

    @Override
    public College deleteColl(long id) {
        return collegeMapper.deleteColl(id);
    }

    @Override
    public List<College> findCollAll(int page, int pageSize){
        PageHelper.startPage(page,pageSize);
        List<College> list=collegeMapper.findCollAll();
        return list;
    }
}
