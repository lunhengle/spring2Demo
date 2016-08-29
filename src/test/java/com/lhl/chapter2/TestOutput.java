package com.lhl.chapter2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lunhengle on 2016/8/29.
 */
public class TestOutput {
    @Test
    public void testOutput() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-chapter2.xml");
        OutputHelper outputHelper = (OutputHelper) applicationContext.getBean("outputHelper");
        outputHelper.getiOutputGenerator().generateOutput();
    }
}
