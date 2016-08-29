package com.lhl.chapter1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lunhengle on 2016/8/29.
 */
public class TestHelloWorld {
    @Test
    public void testHelloWorld(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-chapter1.xml");
        HelloWorld helloWorld= (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.printHello();
    }
}
