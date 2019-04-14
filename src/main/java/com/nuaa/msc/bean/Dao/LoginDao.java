package com.nuaa.msc.bean.Dao;



import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "(LoginDao)登录模型")
public class LoginDao {
    public LoginDao(){
        this.username="";
        this.password="";
    }
    public LoginDao(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 用户账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public String getUsername() {
        return username;
    }



    public void setUsername(String name) {
        this.username = name;
    }


    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }

}



