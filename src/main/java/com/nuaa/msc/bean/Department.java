package com.nuaa.msc.bean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "(Department)部门")
public class Department {
    private Integer id;
    private String name;
    private String extension;
    public Department(){
        this.id=null;
        this.name="";
        this.extension=null;

    }
    public Department(Integer id, String name, String extension){
        this.id=id;
        this.name=name;
        this.extension=extension;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
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
