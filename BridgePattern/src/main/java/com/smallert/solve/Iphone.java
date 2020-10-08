package com.smallert.solve;

public abstract class Iphone {
    private Software software;

    public Iphone(Software software) {
        this.software = software;
    }

    public void run(){
        software.run();
    }
}
