package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/8/29.
 * 松耦合实现
 */
public class OutputHelper {
    private IOutputGenerator iOutputGenerator;

    public IOutputGenerator getiOutputGenerator() {
        return iOutputGenerator;
    }

    public void setiOutputGenerator(IOutputGenerator iOutputGenerator) {
        this.iOutputGenerator = iOutputGenerator;
    }
}
