package com.smallart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tank tank = new Tank();
        Decorate decorate = new ProtectDecorate(tank);
        decorate.paint();
    }
}
