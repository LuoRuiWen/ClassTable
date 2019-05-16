package com.luo.dao;

import com.luo.entity.StudentEntity;

public interface StudentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    StudentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StudentEntity record);

    int updateByPrimaryKey(StudentEntity record);

    int classStuCount(String tClassId);
}