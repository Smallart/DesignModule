package com.smallart;

import edu.princeton.cs.algs4.In;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Actioner actioner = new Actioner();
        Command commandOne =new CommandOne(actioner);
        Command commandTwo = new CommandTwo(actioner);
        Invoker invoker = new Invoker();
        invoker.add(commandOne);
        invoker.add(commandTwo);
        invoker.notifier();
    }
}
