package com.smallert;

import com.smallert.SimpleFactory.Factory;
import com.smallert.SimpleFactory.comman.ProductionType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Factory factory = new Factory();
        factory.createProduction(ProductionType.CAR).describe();
    }
}
