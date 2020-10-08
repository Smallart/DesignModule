package com.smallert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
