package com.lhl.chapter3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lunhengle on 2016/8/30.
 * java_config
 * 如果报错 换成 jdk 1.7　就没有问题了
 */
public class TestAppConfig {
    @Test
    public void testAppConfig(){
        ApplicationContext  applicationContext =new AnnotationConfigApplicationContext(AppConfig.class);
        IAnimal obj=(IAnimal) applicationContext.getBean("animal");
        obj.makeSound();
    }
}
