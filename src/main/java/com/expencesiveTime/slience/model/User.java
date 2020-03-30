package com.expencesiveTime.slience.model;


public class User {
    private String name;
    private String password;
    private int id;
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
