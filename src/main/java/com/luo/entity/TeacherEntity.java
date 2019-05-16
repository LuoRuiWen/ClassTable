package com.luo.entity;

import java.util.Date;

public class TeacherEntity {
    private String id;

    private String name;

    private Boolean sex;

    private Integer age;

    private String password;

    private Date createTime;

    private Boolean isDeleted;

    private byte[] teacherNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public byte[] getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(byte[] teacherNum) {
        this.teacherNum = teacherNum;
    }
}