package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2020-06-04 16:05
 */

@Controller  //不是restcontroller  因为不是返回json数据
public class ThymeleafController {

    @RequestMapping("/demo1")
    public String test(Model model){
        model.addAttribute("hello","welcome,thymel");
        return "demo1"; //要拼 前缀和后缀 视图解析
    }
}
