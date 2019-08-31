package com.etc.dao;

import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.service.HouseService;
import com.etc.test.BaseTest;
import com.etc.vo.HouseSearchVO;
import com.etc.vo.HouseVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class HouseDAOTest extends BaseTest {

    @Autowired
    private HouseDAO houseDAO;

    @Test
    public void testFabu(){
        User user=new User();
        user.setUserId(2);
        House house=new House(null,"222",80.0,new Date(),"aaa","a","b",user);
        houseDAO.fabu(house);
    }

    @Test
    public void  testSearch(){
        HouseSearchVO searchVO=new HouseSearchVO();
        searchVO.setName("333");
        searchVO.setMinRect(70.0);
        searchVO.setMaxRect(90.0);
        PageHelper.startPage(1,2);

        List<House> list= houseDAO.search(searchVO);

        PageInfo<House> pageInfo=new PageInfo<>(list);
        System.out.println(pageInfo);
        for (House house:list){
            System.out.println(house);
        }
    }
    @Test
    public void  testDelete(){
        HouseService houseService=new HouseService();
        houseService.delete(21);
//        houseDAO.delete(22);
    }
    @Test
    public void ces(){
        List<House> houses= houseDAO.houseById(2);
        for (House h:houses){
            System.out.println(h);
        }
    }
}
