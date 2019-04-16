package com.nuaa.msc.bean;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "(DepartmentUser)部门和人员关系")
public class DepartmentUser {
    private Integer id;
    private Integer departmentId;
    private Integer userId;
    private String role;
    private String extension;
    public DepartmentUser(){
        this.id=null;
        this.departmentId=null;
        this.userId=null;
        this.role=null;
        this.extension=null;
    }
    public DepartmentUser(Integer id,Integer departmentId,Integer userId,String role,String extension){
        this.id=id;
        this.departmentId=departmentId;
        this.userId=userId;
        this.role=role;
        this.extension=extension;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
