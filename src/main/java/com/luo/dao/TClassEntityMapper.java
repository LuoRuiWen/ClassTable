package com.luo.dao;

import com.luo.entity.TClassEntity;

public interface TClassEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(TClassEntity record);

    int insertSelective(TClassEntity record);

    TClassEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TClassEntity record);

    int updateByPrimaryKey(TClassEntity record);

//    int classStuCount(String id);
}