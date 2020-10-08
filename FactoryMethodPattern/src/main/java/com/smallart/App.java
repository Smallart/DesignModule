package com.smallart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Factory factory = new CatFactory();
        factory.birth();
    }
}
