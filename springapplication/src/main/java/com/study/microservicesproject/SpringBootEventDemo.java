package com.study.microservicesproject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class SpringBootEventDemo {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootEventDemo.class)
                // 增加监听器
                .listeners(event -> {
                    System.err.println("监听到事件 ： " + event.getClass().getSimpleName());
                })
                .run(args)
                .close();
        // 运行
    }
}
