package com.expensivetime.sileence.model;


import java.sql.Date;

public class News {

    private int id;
    private String title;
    private String content;
    private String description;
    private int opinions;
    private  int comments;
    private Date createdTime;
    private String isAvailable;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public News(){}
    public News(String title, String content, String description, int opinions, int comments, Date createdTime, String isAvailable,int userId) {
        this.title = title;
        this.userId = userId;
        this.content = content;
        this.description = description;
        this.opinions = opinions;
        this.comments = comments;
        this.createdTime = createdTime;
        this.isAvailable = isAvailable;
    }

    public News(int id, String title, String content, String description, int opinions, int comments, Date createdTime, String isAvailable,int userId) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.description = description;
        this.opinions = opinions;
        this.comments = comments;
        this.createdTime = createdTime;
        this.isAvailable = isAvailable;

    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOpinions() {
        return opinions;
    }

    public void setOpinions(int opinions) {
        this.opinions = opinions;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}
