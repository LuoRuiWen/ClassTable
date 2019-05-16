package com.luo.dao;

import com.luo.entity.ClassTableEntity;

public interface ClassTableEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClassTableEntity record);

    int insertSelective(ClassTableEntity record);

    ClassTableEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClassTableEntity record);

    int updateByPrimaryKey(ClassTableEntity record);
}