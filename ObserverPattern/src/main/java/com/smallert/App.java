package com.smallert;

import com.smallert.event.Dogg;
import com.smallert.event.Personn;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Personn personn = new Personn();
        personn.add(new Dogg());
        personn.feed();
    }
}
