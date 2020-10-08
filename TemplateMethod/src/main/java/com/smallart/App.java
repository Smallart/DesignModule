package com.smallart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Code code = new NanChangCode();
        code.decode("SmallJooo");
        code = new BeijingCode();
        code.decode("SmallJooo");
    }
}
