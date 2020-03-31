package com.expensivetime.sileence.model;


public class User {
    private String name;
    private String password = "";
    private int id;
    private String headUrl;

    public User(String name, int id, String headUrl) {
        this.name = name;
        this.id = id;
        this.headUrl = headUrl;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public User(){

    }
    public User(String name,String password){
        this.name = name;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
