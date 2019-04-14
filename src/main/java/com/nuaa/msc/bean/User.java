package com.nuaa.msc.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "(User)用户")
public class User implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户账号
     */
    private String username;

    private String realName;
    private String nickName;

    //个人主页
    private String homePage;

    private Integer gender;

    private String studentNum;

    private String extension;

    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String major;

    public User(){
        this.username="";
        this.password="";
        this.id=null;
        this.realName=null;
        this.nickName=null;
        this.homePage=null;
        this.gender=null;
        this.studentNum=null;
        this.extension=null;
        this.birthday=null;
    }
    public User(Integer id,String username,String realName,String nickName,String homePage,Integer gender,String studentNum,
                String extension,String password,Date birthday) {
        this.username=username;
        this.password=password;
        this.id=id;
        this.realName=realName;
        this.nickName=nickName;
        this.homePage=homePage;
        this.gender=gender;
        this.studentNum=studentNum;
        this.extension=extension;
        this.birthday=birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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

    public void setExtension(String extention) {
        this.extension = extension;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

