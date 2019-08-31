package com.etc.entity;

import java.util.Date;

public class House {
    private Integer hId;
    private String hName;
    private Double hRect;
    private Date hDate;
    private String hLoc1;
    private String hLoc2;
    private String hImg;
    private User user;


    public House(Integer hId, String hName, Double hRect, String hLoc1, String hLoc2, String hImg, User user) {
        this.hId = hId;
        this.hName = hName;
        this.hRect = hRect;
        this.hLoc1 = hLoc1;
        this.hLoc2 = hLoc2;
        this.hImg = hImg;
        this.user = user;
    }

    public House() {
    }

    public House(Integer hId, String hName, Double hRect, Date hDate, String hLoc1, String hLoc2, String hImg, User user) {
        this.hId = hId;
        this.hName = hName;
        this.hRect = hRect;
        this.hDate = hDate;
        this.hLoc1 = hLoc1;
        this.hLoc2 = hLoc2;
        this.hImg = hImg;
        this.user = user;
    }

    @Override
    public String toString() {
        return "House{" +
                "hId=" + hId +
                ", hName='" + hName + '\'' +
                ", hRect=" + hRect +
                ", hDate=" + hDate +
                ", hLoc1='" + hLoc1 + '\'' +
                ", hLoc2='" + hLoc2 + '\'' +
                ", hImg='" + hImg + '\'' +
                ", user=" + user +
                '}';
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public Double gethRect() {
        return hRect;
    }

    public void sethRect(Double hRect) {
        this.hRect = hRect;
    }

    public Date gethDate() {
        return hDate;
    }

    public void sethDate(Date hDate) {
        this.hDate = hDate;
    }

    public String gethLoc1() {
        return hLoc1;
    }

    public void sethLoc1(String hLoc1) {
        this.hLoc1 = hLoc1;
    }

    public String gethLoc2() {
        return hLoc2;
    }

    public void sethLoc2(String hLoc2) {
        this.hLoc2 = hLoc2;
    }

    public String gethImg() {
        return hImg;
    }

    public void sethImg(String hImg) {
        this.hImg = hImg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
