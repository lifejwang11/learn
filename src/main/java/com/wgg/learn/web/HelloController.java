package com.wgg.learn.web;

import com.wgg.learn.Service.UserService;
import com.wgg.learn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
    @author:life
    @time:2018年11月28日
**/
@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String user(String username,String password){
        boolean isExit=userService.isExist(username,password);
        if(isExit == true){
            return "SUCCESS";
        }else{
            return "FAIL";
        }

    }
}
