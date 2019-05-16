package com.luo.dao;

import com.luo.entity.LoginEntity;

public interface LoginEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(LoginEntity record);

    int insertSelective(LoginEntity record);

    LoginEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LoginEntity record);

    int updateByPrimaryKey(LoginEntity record);
}