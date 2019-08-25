package com.think.myssmspringboot.controller;

import com.think.myssmspringboot.model.User;
import com.think.myssmspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //声明这是controller层
public class UserController {

    //依赖注入
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String UserLogin(User user) throws Exception {
        //调用dao层
        System.out.println("前端"+user);
        User u = userService.selectUser(user.getUsername());
        System.out.println("数据库"+u);
        if (u.getMobile().equals(user.getMobile())){
            return "success";
        }
        return "failed";
    }

    @RequestMapping(value = "/user", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView selectUser(User user) throws Exception {
        ModelAndView mv = new ModelAndView();
        //调用dao层
        System.out.println("前端"+user);
        User u = userService.selectUser(user.getUsername());
        System.out.println("数据库"+u);
        if (u.getMobile().equals(user.getMobile())){
            mv.addObject("user", u);
            mv.setViewName("user");
            return mv;
        }
        mv.setViewName("failed");
        return mv;
    }
}
