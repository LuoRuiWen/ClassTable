package com.luo.service.impl;

import com.luo.dao.TClassEntityMapper;
import com.luo.entity.TClassEntity;
import com.luo.service.TClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TClassServiceImpl implements TClassService {
    @Autowired
    private TClassEntityMapper tClassDao;

    public TClassEntity selectTClassById(String id){
        return tClassDao.selectByPrimaryKey(id);
    }
}
