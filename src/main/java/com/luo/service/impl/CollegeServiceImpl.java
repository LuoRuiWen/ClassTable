package com.luo.service.impl;

import com.luo.dao.CollegeEntityMapper;
import com.luo.entity.CollegeEntity;
import com.luo.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeEntityMapper collegeDao;

    public CollegeEntity selectCollegeById(String id){
        return collegeDao.selectByPrimaryKey(id);
    }

}
