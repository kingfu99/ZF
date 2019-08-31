package com.etc.entity;

//1、首先就是创建实体类的属性，然后生成getter setter有时候要生成构造方法（有参无参和除去id的构造方法）一般和数据库对应
//数据库的t_xxx表，属性对应数据库的字段
public class User {
    private Integer userId;
    private String userName;
    private String userPass;
    private String userTel;
    private String userRealName;

    public User(String userName, String userPass, String userTel, String userRealName) {
        this.userName = userName;
        this.userPass = userPass;
        this.userTel = userTel;
        this.userRealName = userRealName;
    }

    public User() {
    }

    public User(Integer userId, String userName, String userPass, String userTel, String userRealName) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.userTel = userTel;
        this.userRealName = userRealName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userRealName='" + userRealName + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
}
