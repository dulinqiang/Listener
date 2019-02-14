package com.example.demo;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author
 * @Date 2019/2/14
 * @Description:
 * 首先自定义一个事件，需要继承ApplicationEvent类，
 * 相当于安装了一个没有通电，没有灯光的信号灯，需要具有信号灯的基本特征
 */
@Data
public class Event extends ApplicationEvent {

    private String message;

    public Event(Object source, String message) {
        super(source);
        this.message = message;
    }


}
