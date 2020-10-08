package com.smallert;

/**
 * Singleton 保证一个类仅有一个实例，并提供一个访问它的全局访问点
 *
 * 让类自身负责保存它的唯一实例。这个类可以保证没有其他实例可以被创建，并且它可以提供一个访问该实例的方法
 * 因为Singleton类封装它的唯一实例，这样它可以严格控制客户怎么访问它以及何时访问它，简单来说就是对唯一实例的控制访问
 *
 * 单例类与工具类的区别
 * 1. 工具类是一些方法的集合，而单例类却是有着唯一的对象实例
 * 2. 工具类不能保存状态，而单例类是有状态的
 * 3. 工具类不能继承多态，但是单例类可以有子类
 *
 * 但是要注意的是单例会因为某些原因突破单例模式
 * 1. 多线程 解决方法：加锁 synchronized 会影响到性能
 * 2.
 */
public class SingleDog {
    private static volatile SingleDog singleDog;
    private SingleDog(){}
    public static SingleDog getInstance(){
        if (singleDog==null){
            synchronized (SingleDog.class){
                if (singleDog==null){
                    singleDog = new SingleDog();
                }
            }
        }
        return singleDog;
    }
}
