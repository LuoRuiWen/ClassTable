package com.luo.dao;

import com.luo.entity.StudentClassEntity;

public interface StudentClassEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(StudentClassEntity record);

    int insertSelective(StudentClassEntity record);

    StudentClassEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StudentClassEntity record);

    int updateByPrimaryKey(StudentClassEntity record);
}