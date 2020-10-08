package com.smallear;

import com.smallear.domin.Tank;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(final String[] args )
    {
//        proxy proxy = new proxy(new Tank());
//        proxy.move();
        Tank tank = new Tank();
        Moveable moveable =(Moveable)Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Moveable.class}, (proxy, method, arges) -> {
            System.out.println("工兵工兵");
            Object o = method.invoke(tank, arges);
            System.out.println("步兵步兵");
            return o;
        });
        moveable.move();
    }
}
