package com.atguigu.springboot.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author shkstart
 * @create 2020-06-04 17:15
 */
@WebListener
public class HelloListener implements ServletContextListener {
    @Override//启动时候执行
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
