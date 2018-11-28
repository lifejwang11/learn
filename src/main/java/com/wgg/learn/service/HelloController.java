package com.wgg.learn.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
    @author:life
    @time:2018年11月28日
**/
@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping(value = "/login")
    public String user(){
        return "login";
    }
}
