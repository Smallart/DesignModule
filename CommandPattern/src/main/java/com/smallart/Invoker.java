package com.smallart;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commandList = new ArrayList<>();
    public void add(Command command){
        commandList.add(command);
    }

    public void notifier(){
        for (Command command : commandList) {
            command.execute();
        }
    }

    public void remove(Command command){
        commandList.remove(command);
    }
}
