package com.atguigu.springboot;

import com.atguigu.springboot.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author shkstart
 * @create 2020-06-01 15:42
 */



@MapperScan("com.atguigu.springboot.dao")   //ioc包扫描器
@SpringBootApplication //表示一个springboot项目
@EnableTransactionManagement //开启声明式事务
@EnableScheduling //启用定时任务
@ServletComponentScan
public class MySpringBootApplication {
    public static void main(String[] args) {
        //启用tomcat
        ConfigurableApplicationContext act = SpringApplication.run(MySpringBootApplication.class, args);


    }
}
