package com.etc.converter;

import com.etc.entity.User;
import com.etc.vo.UserVO;

public class UserConverter {
    public static User convert(UserVO userVO){
        User user=new User();
        user.setUserId(userVO.getId());
        user.setUserName(userVO.getName());
        user.setUserPass(userVO.getPassword());
        user.setUserTel(userVO.getTelephone());
        user.setUserRealName(userVO.getUsername());
        return user;
    }
}
