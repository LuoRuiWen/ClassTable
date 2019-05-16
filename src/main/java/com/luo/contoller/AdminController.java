package com.luo.contoller;

import com.luo.model.form.student.AddStudentForm;
import com.luo.service.AdminService;
import com.luo.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/student")
    public ResultData addStudent(AddStudentForm form){
        return adminService.addStudent(form);
    }
}
