package com.smallert;

public class Cat implements AbstractObserver {
    @Override
    public void action() {
        System.out.println("喵喵喵，你是我的奴才");
    }
}
