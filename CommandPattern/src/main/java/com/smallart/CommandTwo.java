package com.smallart;

public class CommandTwo extends Command {

    public CommandTwo(Actioner actioner) {
        super(actioner);
    }

    @Override
    public void execute() {
        actioner.doAction3();
        actioner.doAction2();
    }
}
