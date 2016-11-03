package com.lhl.chapter4;

/**
 * Created by lunhengle on 2016/8/30.
 */
public class Customer  implements ICustomer{
    @Override
    public void sayHello() {
        System.out.println("hello customer");
    }
}
