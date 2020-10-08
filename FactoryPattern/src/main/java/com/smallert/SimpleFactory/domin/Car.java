package com.smallert.SimpleFactory.domin;

public class Car implements Production {
    @Override
    public void describe() {
        System.out.println("嘀嘀嘀嘀，我是一辆车");
    }
}
