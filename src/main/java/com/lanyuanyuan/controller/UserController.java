package com.lanyuanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/quick-start")//请求映射路径
    public String save() {
        System.out.println("Controller save running...");
        return "success.jsp";
    }
}
