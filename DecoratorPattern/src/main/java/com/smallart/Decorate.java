package com.smallart;

public abstract class Decorate extends GameObject{
    protected GameObject gameObject;

    public Decorate(GameObject gameObject) {
        this.gameObject = gameObject;
    }
}
