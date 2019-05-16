package com.luo.dao;

import com.luo.entity.CClassEntity;

public interface CClassEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(CClassEntity record);

    int insertSelective(CClassEntity record);

    CClassEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CClassEntity record);

    int updateByPrimaryKey(CClassEntity record);
}