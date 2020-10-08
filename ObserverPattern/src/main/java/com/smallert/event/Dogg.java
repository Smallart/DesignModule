package com.smallert.event;

public class Dogg implements AbstractObserverEvent {

    @Override
    public void action(FeedEven event) {
        System.out.println(event.getLoc());
        System.out.println("汪汪汪，你是我的天使吧");
    }
}
