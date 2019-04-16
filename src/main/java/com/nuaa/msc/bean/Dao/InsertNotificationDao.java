package com.nuaa.msc.bean.Dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class InsertNotificationDao {
    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    private String location;
    private String summary;
    private Integer userId;
    private String auther;
    private String content;
    private String cover;
    private String participants;
    private String extension;
    public InsertNotificationDao(){
        this.title=null;
        this.time=null;
        this.endTime=null;
        this.startTime=null;
        this.location=null;
        this.participants=null;
        this.summary=null;
        this.userId=null;
        this.auther=null;
        this.content=null;
        this.cover=null;
        this.extension=null;
    };
    public InsertNotificationDao(String title, Date time,
                                 Date startTime, Date endTime, String location, String summary, Integer userId, String auther, String content, String cover,
                                 String participants, String extension){
        this.title=title;
        this.time=time;
        this.endTime=endTime;
        this.startTime=startTime;
        this.location=location;
        this.participants=participants;
        this.summary=summary;
        this.userId=userId;
        this.auther=auther;
        this.content=content;
        this.cover=cover;
        this.extension=extension;
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

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getParticipants() {
        return participants;
    }
}
