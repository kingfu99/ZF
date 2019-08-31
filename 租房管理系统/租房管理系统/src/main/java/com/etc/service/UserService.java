package com.etc.service;

import com.etc.dao.UserDAO;
import com.etc.entity.User;
import com.etc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

//3、调DAO层接口传入service层，用service接收User对象来获取数据库里面的数据
    public void  reg(User user){
        userDAO.reg(user);
    }

    public User login(String name, String password){
         return userDAO.login(name,password);
    }
}
