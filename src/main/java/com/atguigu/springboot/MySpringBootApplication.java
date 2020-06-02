package com.atguigu.springboot;

import com.atguigu.springboot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author shkstart
 * @create 2020-06-01 15:42
 */

@SpringBootApplication //表示一个springboot项目
public class MySpringBootApplication {
    public static void main(String[] args) {
        //启用tomcat
        ConfigurableApplicationContext act = SpringApplication.run(MySpringBootApplication.class, args);

        User user = (User) act.getBean("user");
        System.out.println(user);
    }
}
