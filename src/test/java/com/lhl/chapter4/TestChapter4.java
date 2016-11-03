package com.lhl.chapter4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lunhengle on 2016/8/30.
 */
public class TestChapter4 {
    @Test
    public void testChapter4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-chapter4.xml");
        ICustomer iCustomer = (ICustomer) applicationContext.getBean("customer");
        iCustomer.sayHello();
        IScheduler iScheduler = (IScheduler) applicationContext.getBean("scheduler");
        iScheduler.sayHello();
    }
}
