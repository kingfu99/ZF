package com.etc.dao;

import com.etc.entity.House;
import com.etc.vo.HouseSearchVO;

import java.util.List;

public interface HouseDAO {
    void fabu(House house);

    List<House> search(HouseSearchVO searchVO);
    void update(House house);


    void delete(Integer hId);


    List<House> houseById(Integer userId);

    House houseId(Integer hId);

    House searchById(Integer id);


//
//    List<House> serachAll();
//
    House getById(int id);

}
