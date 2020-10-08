package com.smallart;

public class CommandOne extends Command{
    public CommandOne(Actioner actioner) {
        super(actioner);
    }

    @Override
    public void execute() {
        actioner.doAction1();
        actioner.doAction2();
    }
}
