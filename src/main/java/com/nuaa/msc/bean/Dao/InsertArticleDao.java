package com.nuaa.msc.bean.Dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class InsertArticleDao {
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    private String summary;
    private Integer userId;
    private String auther;
    private String content;
    private String cover;
    private String extension;
    public InsertArticleDao(){
        this.title=null;
        this.time=null;
        this.summary=null;
        this.userId=null;
        this.auther=null;
        this.content=null;
        this.cover=null;
        this.extension=null;
    }
    public InsertArticleDao(String title, Date time, String summary, Integer userId, String auther, String content,
                            String cover, String extension){
        this.title=title;
        this.time=time;
        this.summary=summary;
        this.userId=userId;
        this.auther=auther;
        this.content=content;
        this.cover=cover;
        this.extension=extension;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

}
