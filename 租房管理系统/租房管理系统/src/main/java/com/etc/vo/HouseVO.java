package com.etc.vo;

import com.etc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;


import java.util.Date;

public class HouseVO {
    private Integer hId;
    private String title;
    private Double floorage;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date houseDate;
    private String districtId;
    private String streetId;
    private MultipartFile hImg;
    private User user;

    @Override
    public String toString() {
        return "HouseVO{" +
                "hId=" + hId +
                ", title='" + title + '\'' +
                ", floorage=" + floorage +
                ", houseDate=" + houseDate +
                ", districtId='" + districtId + '\'' +
                ", streetId='" + streetId + '\'' +
                ", hImg=" + hImg +
                ", user=" + user +
                '}';
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getFloorage() {
        return floorage;
    }

    public void setFloorage(Double floorage) {
        this.floorage = floorage;
    }

    public Date getHouseDate() {
        return houseDate;
    }

    public void setHouseDate(Date houseDate) {
        this.houseDate = houseDate;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getStreetId() {
        return streetId;
    }

    public void setStreetId(String streetId) {
        this.streetId = streetId;
    }

    public MultipartFile gethImg() {
        return hImg;
    }

    public void sethImg(MultipartFile hImg) {
        this.hImg = hImg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
