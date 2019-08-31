package com.etc.converter;

import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.HouseVO;

public class HouseConverter {
    public static House conver(HouseVO houseVO, String img, User user){
        House house=new House();
        house.sethId(houseVO.gethId());
        house.sethName(houseVO.getTitle());
        house.sethRect(houseVO.getFloorage());
        house.sethDate(houseVO.getHouseDate());
        house.sethLoc1(houseVO.getDistrictId());
        house.sethLoc2(houseVO.getStreetId());
        house.sethImg(img);
        house.setUser(user);
        return house;
    }
}
