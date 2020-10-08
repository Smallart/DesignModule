package com.smallert;

public class Dog implements AbstractObserver{
    @Override
    public void action() {
        System.out.println("汪汪汪，你是我的天使吧");
    }
}
