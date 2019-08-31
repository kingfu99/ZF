package com.etc.service;

import com.etc.dao.HouseDAO;
import com.etc.dao.UserDAO;
import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.HouseSearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    @Autowired
    private HouseDAO houseDAO;

    public void  fabu(House house){
        houseDAO.fabu(house);
    }
    public List<House> search(HouseSearchVO houseSearchVO){
       return houseDAO.search(houseSearchVO);
    }

//    public List<House> serachAll(){
////        List<House> serach = houseDAO.serachAll();
////        return serach;
////    }

    public void delete(Integer hId){
        houseDAO.delete(hId);
    }

    public  List<House> houseById(Integer userId){
        return houseDAO.houseById(userId);
    }

    public  House houseId(Integer hId){
        return houseDAO.houseId(hId);
    }


    public House getById(int id){
        House house = houseDAO.getById(id);
        return house;
    }
//
    public void update(House house){
        houseDAO.update(house);
    }
    public House searchById(Integer id){
        return  houseDAO.searchById(id);
    }
}
