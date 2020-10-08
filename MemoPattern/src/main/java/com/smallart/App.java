package com.smallart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tank tank = new Tank(5);
        System.out.println("tank的速度："+tank.getSpeed());
        MemoHolder memoHolder = new MemoHolder(tank.backUp());
        tank.enhanceSpeed(2);
        System.out.println("加速后tank的速度："+tank.getSpeed());
        tank.back(memoHolder.getMemo());
        System.out.println("还原tank的速度："+tank.getSpeed());
    }
}
