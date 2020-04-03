package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wangjunwei
 * @Description: 页面跳转controller
 * @Date: Created in 17:38 2019/6/14
 */
@Controller
public class BaseController {
    @RequestMapping("/")
    public String toIndex(){
        return "admin";
    }

    @RequestMapping("/{pageName}")
    public String toPage(@PathVariable String pageName){
        return pageName;
    }
}
