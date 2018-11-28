package com.wgg.learn.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
    @author:life
    @time:2018年11月28日
   **/
@Controller
public class JspController {

    @GetMapping(value = "/jsp/test")
    public String test(){
        return "test";
    }
}
