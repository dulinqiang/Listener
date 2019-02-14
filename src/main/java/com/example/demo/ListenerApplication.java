package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ListenerApplication {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(ListenerApplication.class, args);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
        EventPublish eventPbulish = context.getBean(EventPublish.class);
        eventPbulish.publish("zhangsan");
//        ((ConfigurableApplicationContext) context).close();
    }

}

