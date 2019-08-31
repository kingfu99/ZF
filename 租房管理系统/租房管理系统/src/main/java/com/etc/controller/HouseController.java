package com.etc.controller;

import com.etc.common.Constant;
import com.etc.converter.HouseConverter;
import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.service.HouseService;
import com.etc.vo.HouseSearch02;
import com.etc.vo.HouseSearchVO;
import com.etc.vo.HouseVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/house")
public class HouseController {
    @RequestMapping("/images")
    public String imgages(String imgName, HttpServletResponse response) throws IOException {
        IOUtils.copy(new FileInputStream(UPLOAD_DIR + imgName), response.getOutputStream());
        return null;
    }


    private static final String UPLOAD_DIR = "D:\\images\\";

    @Autowired
    private HouseService houseService;

    @RequestMapping("/fabu")
    public String fabu(HouseVO houseVO, HttpSession session) throws IOException {
//        System.out.println("houseVO---------------"+houseVO);

        houseVO.gethImg().transferTo(new File(UPLOAD_DIR + houseVO.gethImg().getOriginalFilename()));
        User user = (User) session.getAttribute("user");

        House house = HouseConverter.conver(houseVO, houseVO.gethImg().getOriginalFilename(), user);
        houseService.fabu(house);

        return "redirect:/house/guanliList";
    }

    @RequestMapping("/search")
    public String search(@ModelAttribute("vo") HouseSearch02 houseSearchVO, Integer pageNum, Model model) {
        if (pageNum == null) {
            pageNum = 1;//第一次访问的时候，不传当前页面，系统自动指定为第一页
        }
        System.out.println(houseSearchVO);
        HouseSearchVO houseSearchVO1 = new HouseSearchVO();
        houseSearchVO1.setName(houseSearchVO.getName());


        if (!StringUtils.isEmpty(houseSearchVO.getFloorage())) {
            String[] str = houseSearchVO.getFloorage().split("-");
            houseSearchVO1.setMinRect(Double.valueOf(str[0]));
            houseSearchVO1.setMaxRect(Double.valueOf(str[1]));
        }
        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);
        //houseService.search(houseSearchVO1);
        PageInfo<House> pageInfo = new PageInfo<>(houseService.search(houseSearchVO1));
        model.addAttribute("pageInfo", pageInfo);
        return "list";
    }

    //
    @RequestMapping("/delete")
    public String delete(Integer hId) {
        houseService.delete(hId);
        return "redirect:/house/guanliList";
    }

    @RequestMapping("guanliList")
    public String guanliList(Model model, HttpSession session) {

        User user = (User) session.getAttribute("user");

        List<House> houses = houseService.houseById(user.getUserId());
        model.addAttribute("houses", houses);
        return "guanli";
    }

    //
//    @RequestMapping("/detalis")
//    public String detalis(Integer houseId,Model model) {
//        House house = houseService.getById(houseId);
//        model.addAttribute("house", house);
//        return "details";
//    }
//
//
    @RequestMapping("/update")
    public String update(Integer houseId, Model model) {

        House house = houseService.getById(houseId);
        model.addAttribute("house", house);
        return "update";
    }

    //
    @RequestMapping("/updateHouse")
    public String updateHouse(HouseVO houseVo, HttpSession session) throws IOException {
        String img = "1.png";
        if (!StringUtils.isEmpty(houseVo.gethImg().getOriginalFilename())) {
            houseVo.gethImg().transferTo(new File(UPLOAD_DIR + houseVo.gethImg().getOriginalFilename()));
            img = houseVo.gethImg().getOriginalFilename();
        }
        User loginUser = (User) session.getAttribute("user");
        //User user=new User();
        //user.setUserId(2);
        House house = HouseConverter.conver(houseVo, img, loginUser);
        System.out.println("house==========="+house);
        houseService.update(house);
        return "redirect:/house/guanliList";
    }
    @RequestMapping("/details")
    public String searchInfo(Integer id,Model model){
        House house=houseService.searchById(id);
        model.addAttribute("house",house);
        return "details";
    }
}
