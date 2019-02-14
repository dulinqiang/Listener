package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author
 * @Date 2019/2/14
 * @Description
 * 创建一个监听类，相当于行人（不管是否使用交通工具），需要实现ApplicationListener接口
 * 可以理解成这个行人需要看信号灯，并且能理解信号灯的意思才行
 */
@Component
public class Listener1 implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        System.out.println("test1:" + event.getMessage());
    }
}
