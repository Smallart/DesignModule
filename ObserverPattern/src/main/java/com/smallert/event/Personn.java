package com.smallert.event;

import com.smallert.AbstractObserver;

import java.util.ArrayList;
import java.util.List;

public class Personn {
    private List<AbstractObserverEvent> observers = new ArrayList<>();

    public void add(AbstractObserverEvent observer){
        observers.add(observer);
    }

    public void feed(){
        FeedEven feedEven = new FeedEven("喂宠物了");
        for (AbstractObserverEvent observer : observers) {
            observer.action(feedEven);
        }
    }
}
