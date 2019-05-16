package com.luo.entity;

import java.util.Date;

public class SpecialityEntity {
    private String id;

    private String name;

    private String specialityNum;

    private Date createTime;

    private Boolean isDeleted;

    private String collegeId;

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

    public String getSpecialityNum() {
        return specialityNum;
    }

    public void setSpecialityNum(String specialityNum) {
        this.specialityNum = specialityNum;
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

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }
}