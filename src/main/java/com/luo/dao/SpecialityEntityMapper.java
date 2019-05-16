package com.luo.dao;

import com.luo.entity.SpecialityEntity;

public interface SpecialityEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(SpecialityEntity record);

    int insertSelective(SpecialityEntity record);

    SpecialityEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SpecialityEntity record);

    int updateByPrimaryKey(SpecialityEntity record);
}