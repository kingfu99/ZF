package com.etc.controller;

import com.etc.converter.UserConverter;
import com.etc.dao.UserDAO;
import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
    public class UserController {
    //注入UserService
    @Autowired
    private UserService userService;

    //4、注册 访问（/house/reg）进入WEBINFO的jsp的regs页面 进入到regs.jsp界面，这里需要配置一个-- 视图解析器--
    @RequestMapping("/reg")
    public String reg() {
        return "regs";
    }


    @RequestMapping("/doreg")
    public String doreg(@ModelAttribute("userVO") @Valid UserVO userVO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "regs";
        }
        System.out.println(userVO);
        User user1 = UserConverter.convert(userVO);
        userService.reg(user1);
        return "redirect:login";
    }
    //登录
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/dologin")
    public String dologin(String name,String password,HttpSession session) {

        System.out.println(name+password);
        User user =userService.login(name,password);

        if(user==null){
            return "login";
        }
        session.setAttribute("user",user);
        return "redirect:/house/guanliList";
    }
}
