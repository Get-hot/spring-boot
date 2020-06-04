package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-02 20:28
 */


@RestController  //相当于异步处理 返回json数据
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;



    @RequestMapping("/findAll")
    public List<User> findAll(){
        List<User> users = userService.findAll();
        System.out.println("list" + users);
        return users;
    }
    @RequestMapping("/saveUser")
    public void saveUser(User user){

        userService.saveUser(user);
    }
}
