package com.smallert.AbstractFactory;

/**
 * 简单工厂模式只是产生某个类的一种模式
 * 而抽象工厂模式，提供了一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 *
 * 抽象工厂的最大好处：易于交换产品系列，
 * 1. 我们设计上不能去放置需求改动，而是要让改动变得更小
 * 2. 让具体的创建实例过程与客户端分离，客户端是通过它们的抽象接口操作实例。产品的具体类名也被具体工厂类的实现分离。
 *
 * 缺点：
 * 在添加新的产品是要添加很多新的类
 */
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
