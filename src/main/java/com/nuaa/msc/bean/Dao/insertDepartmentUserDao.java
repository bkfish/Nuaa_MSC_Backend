package com.nuaa.msc.bean.Dao;

import lombok.Data;

@Data
public class insertDepartmentUserDao {
    private Integer departmentId;
    private Integer userId;
    private String role;
    private String extension;
    public insertDepartmentUserDao(){
        this.departmentId=null;
        this.userId=null;
        this.role=null;
        this.extension=null;
    }
    public insertDepartmentUserDao(Integer departmentId,Integer userId,String role,String extension){
        this.departmentId=departmentId;
        this.userId=userId;
        this.role=role;
        this.extension=extension;
    }


    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }
}
