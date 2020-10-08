package com.smallert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SingleDog dogOne = SingleDog.getInstance();
        SingleDog dogTwo = SingleDog.getInstance();
        System.out.println(dogOne==dogTwo);
    }
}
