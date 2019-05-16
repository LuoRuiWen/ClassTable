package com.luo.service.impl;

import com.luo.dao.StudentEntityMapper;
import com.luo.entity.StudentEntity;
import com.luo.exception.ServiceException;
import com.luo.service.StudentService;
import com.luo.utils.IdUtils;
import com.luo.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentEntityMapper studentDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public ResultData addStudent(StudentEntity student){
        try {
            int result = studentDao.insert(student);
            if (result < 1) {
                throw new ServiceException("新增学生出错", 501);
            }
            return ResultData.ok(result);
        }catch (ServiceException e){
            throw e;
        }catch (Exception e){
            throw new ServiceException("新增学生失败！",e);
        }
    }

    public StudentEntity selectStudentById(String id){
        return studentDao.selectByPrimaryKey(id);
    }

    public int classStuCount(String classId){
        return studentDao.classStuCount(classId);
    }
}
