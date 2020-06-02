package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-06-01 15:43
 */


@RestController
public class QuickStartController {

    @RequestMapping("/hello")
    public String hello(){
        return "ok";
    }
}
