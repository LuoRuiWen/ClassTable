package com.luo.dao;

import com.luo.entity.SysUserEntity;

public interface SysUserEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUserEntity record);

    int insertSelective(SysUserEntity record);

    SysUserEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUserEntity record);

    int updateByPrimaryKey(SysUserEntity record);
}