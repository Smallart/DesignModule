package com.smaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BuilderManager builderManager = new BuilderManager(new MapOne());
        builderManager.Build();
        BuilderManager builderManagerTwo =new BuilderManager(new MapTwo());
        builderManagerTwo.Build();
    }
}
