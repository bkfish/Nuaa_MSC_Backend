package com.nuaa.msc.bean.Dao;

import lombok.Data;

@Data
public class InsertDepartmentDao {
    private String name;
    private String extension;
    public InsertDepartmentDao(){
        this.name="";
        this.extension=null;

    }
    public InsertDepartmentDao(String name, String extension){
        this.name=name;
        this.extension=extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
