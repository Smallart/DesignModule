package com.smallert.AbstractFactory.amendment.reflect;

import com.smallert.AbstractFactory.IDepartment;
import com.smallert.AbstractFactory.IUser;

import java.lang.reflect.InvocationTargetException;

/**
 * 在抽象工厂模式中利用简单工厂和反射解决switch
 */
public class ReflectFactory {
    public IUser createUser(String className){
        IUser user =null;
        try {
            user =(IUser) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }

    public IDepartment createDepartment(String className){
        IDepartment department= null;
        try {
            department =(IDepartment)Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return department;
    }
}
