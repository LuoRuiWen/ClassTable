package com.luo.dao;

import com.luo.entity.ClassTimeEntity;

public interface ClassTimeEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClassTimeEntity record);

    int insertSelective(ClassTimeEntity record);

    ClassTimeEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClassTimeEntity record);

    int updateByPrimaryKey(ClassTimeEntity record);
}