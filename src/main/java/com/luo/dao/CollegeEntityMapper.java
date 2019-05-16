package com.luo.dao;

import com.luo.entity.CollegeEntity;

public interface CollegeEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(CollegeEntity record);

    int insertSelective(CollegeEntity record);

    CollegeEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CollegeEntity record);

    int updateByPrimaryKey(CollegeEntity record);
}