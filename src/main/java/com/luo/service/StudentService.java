package com.luo.service;

import com.luo.entity.StudentEntity;
import com.luo.utils.ResultData;

public interface StudentService {
    StudentEntity selectStudentById(String id);
    int classStuCount(String classId);
    ResultData addStudent(StudentEntity student);
}
