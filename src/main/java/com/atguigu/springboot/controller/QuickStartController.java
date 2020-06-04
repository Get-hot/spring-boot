package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-06-01 15:43
 */


@RestController
public class QuickStartController {

//    @Value("${person.name}")
//    private String name;
//    @Value("${person.age}")
//    private Integer age;




    @RequestMapping("/hello")
    public String hello(){
//        System.out.println(name+"-----"+age);
        return "ok";
    }
}
