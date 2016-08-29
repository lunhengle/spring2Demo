package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/8/29.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("第一个spring 3:Hello!" + name);
    }
}
