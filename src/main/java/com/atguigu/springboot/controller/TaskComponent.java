package com.atguigu.springboot.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2020-06-04 15:44
 */
@Component //声明定时任务的组件
public class TaskComponent {
    @Scheduled(fixedDelay = 3000)
    public void printTime(){

    }
}
