package com.smallart;

public abstract class Command {
    protected Actioner actioner;

    public Command(Actioner actioner) {
        this.actioner = actioner;
    }

    public  abstract void execute();
}
