package com.luo.service.impl;

import com.luo.dao.SpecialityEntityMapper;
import com.luo.entity.SpecialityEntity;
import com.luo.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceImpl implements SpecialityService {
    @Autowired
    private SpecialityEntityMapper specialityDao;

    public SpecialityEntity selectSpecialityById(String id){
        return specialityDao.selectByPrimaryKey(id);
    }
}
