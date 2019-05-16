package com.luo.service;

import com.luo.model.form.student.AddStudentForm;
import com.luo.utils.ResultData;

public interface AdminService {
    ResultData addStudent(AddStudentForm studentForm);
}
