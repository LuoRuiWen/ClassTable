package com.luo.service.impl;

import com.luo.dao.SpecialityEntityMapper;
import com.luo.dao.StudentEntityMapper;
import com.luo.dao.TClassEntityMapper;
import com.luo.entity.CollegeEntity;
import com.luo.entity.SpecialityEntity;
import com.luo.entity.StudentEntity;
import com.luo.entity.TClassEntity;
import com.luo.model.form.student.AddStudentForm;
import com.luo.service.*;
import com.luo.utils.ResultData;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.luo.dao.CollegeEntityMapper;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private StudentService studentService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /*@Autowired
    private CollegeEntityMapper collegeEntityDao;

    @Autowired
    private TClassEntityMapper tclassDao;

    @Autowired
    private SpecialityEntityMapper specialityDao;

    @Autowired
    private StudentEntityMapper studentDao;*/

    @Autowired
    private SpecialityService specialityService;

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private TClassService tClassService;


    public ResultData addStudent(AddStudentForm studentForm){
        StudentEntity student = new StudentEntity();
        BeanUtils.copyProperties(studentForm,student);
        Date now = new Date();
        student.setCreateTime(now);
        String password = student.getCardId().substring(15);
        password = bCryptPasswordEncoder.encode(password);
        student.setPassword(password);
        String studentNum = getStudentNum(student);
        student.setStudentNum(studentNum);

        return ResultData.ok(studentService.addStudent(student));
    }

    private String getStudentNum(StudentEntity student){
        SimpleDateFormat sdf = new SimpleDateFormat("yy");
        StringBuilder sb = new StringBuilder();
        String year = sdf.format(student.getJoinTime());

        String tclassId = student.gettClassId();
        TClassEntity tClassEntity =  tClassService.selectTClassById(tclassId);
        String classNum = tClassEntity.getTClassNum();

        String specialityId = tClassEntity.getSpecialityId();
        SpecialityEntity specialityEntity = specialityService.selectSpecialityById(specialityId);
        String specialityNum = specialityEntity.getSpecialityNum();

        String collegeId= specialityEntity.getCollegeId();
        CollegeEntity collegeEntity = collegeService.selectCollegeById(collegeId);
        String collegeNum = collegeEntity.getCollegeNum();

        int orderNum = studentService.classStuCount(tclassId);
        String stuNum = (orderNum+1)+"";

        sb.append(year);
        sb.append(collegeNum);
        sb.append(specialityNum);
        sb.append(classNum);
        if(stuNum.length()<2){
            sb.append(0);
        }
        return sb.toString();
    }
}
