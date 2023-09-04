package com.cz.delayqueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class DelayQueueApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(DelayQueueApplication.class, args);

        //1、获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();

        Arrays.asList(names).stream().forEach(
                bean -> {
                    if (bean.contains("Queue"))
                        System.out.println(bean);
                }
        );


    }

}
