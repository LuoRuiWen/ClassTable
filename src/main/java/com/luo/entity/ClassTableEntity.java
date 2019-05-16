package com.luo.entity;

import java.util.Date;

public class ClassTableEntity {
    private String id;

    private String className;

    private Integer classGread;

    private Integer classType;

    private Date createTime;

    private Boolean idDeleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassGread() {
        return classGread;
    }

    public void setClassGread(Integer classGread) {
        this.classGread = classGread;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIdDeleted() {
        return idDeleted;
    }

    public void setIdDeleted(Boolean idDeleted) {
        this.idDeleted = idDeleted;
    }
}