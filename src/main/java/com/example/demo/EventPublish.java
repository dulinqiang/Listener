package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author
 * @Date 2019/2/14
 * @Description
 * 需要一个控制信号灯变化的东西，相当于是给他接好电线，给他一个正常变换红黄绿的程序和电路
 */
@Component
public class EventPublish {

    @Autowired
    ApplicationContext context;

    public void publish(String message) {
        context.publishEvent(new Event(this, message));
    }

}
