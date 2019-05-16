package com.luo.model.form.student;


import lombok.Data;

import java.util.Date;

@Data
public class AddStudentForm {
    private String name;
    private Boolean sex;
    private Integer age;
    private String cardId;
    private String zybh;
    private Date joinTime;
}
