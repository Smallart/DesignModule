package com.smallert;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<AbstractObserver> observers = new ArrayList<>();

    public void add(AbstractObserver observer){
        observers.add(observer);
    }

    public void feed(){
        System.out.println("喂宠物了");
        for (AbstractObserver observer : observers) {
            observer.action();
        }
    }
}
