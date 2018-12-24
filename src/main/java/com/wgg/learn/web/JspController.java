package com.wgg.learn.web;

import com.wgg.learn.dao.Mybatis;
import com.wgg.learn.exception.UrlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wgg.learn.pojo.User;
import org.springframework.web.bind.annotation.ResponseBody;

/**
    @author:life
    @time:2018年11月28日
   **/
@Controller
@RequestMapping("/jsp")
public class JspController {

    @Autowired
    private Mybatis mybatis;

    @GetMapping(value = "/test")
    public String test(){
        return "test";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String login(User user){
        User us=mybatis.findByUserNameAndPassword(user.getName(),user.getPassword());
        if(us == null){
            return "FAIL";
        }else{
            return "SUCCESS";
        }
    }

    @GetMapping(value = "/error")
    public String testone(){
        try {
            int i=1/0;
        }catch (ArithmeticException url){
            throw new UrlException("1000");
        }
       return "404";
    }
}
