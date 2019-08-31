package com.etc.dao;

import com.etc.entity.User;
import com.etc.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDAOTest extends BaseTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testReg(){
        User user=new User();
        user.setUserName("付志颖");
        user.setUserPass("123456");
        user.setUserTel("123456789");
        user.setUserRealName("fuzhiying");
        userDAO.reg(user);
    }

    @Test
    public void ceshi(){
       User user = userDAO.login("a","b");
        System.out.println(user);
    }
}

