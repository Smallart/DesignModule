package com.smallert.SimpleFactory.domin;

public class Computer implements Production {
    @Override
    public void describe() {
        System.out.println("我是一台电脑");
    }
}
