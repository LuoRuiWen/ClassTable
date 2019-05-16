package com.luo.entity;

import java.util.Date;

public class LoginEntity {
    private String id;

    private String teacherId;

    private String studentId;

    private String sysMemId;

    private String athorization;

    private Date createTime;

    private Date effectTime;

    private Date endTime;

    private Boolean isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSysMemId() {
        return sysMemId;
    }

    public void setSysMemId(String sysMemId) {
        this.sysMemId = sysMemId;
    }

    public String getAthorization() {
        return athorization;
    }

    public void setAthorization(String athorization) {
        this.athorization = athorization;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}