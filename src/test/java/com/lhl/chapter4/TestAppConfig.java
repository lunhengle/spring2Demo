package com.lhl.chapter4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lunhengle on 2016/8/30.
 */
public class TestAppConfig {
    @Test
    public void testAppConfig() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ICustomer iCustomer = (ICustomer) applicationContext.getBean("customer");
        iCustomer.sayHello();
        IScheduler iScheduler = (IScheduler) applicationContext.getBean("scheduler");
        iScheduler.sayHello();
    }
}
