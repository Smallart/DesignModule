package com.smallert.AbstractFactory.Impl;

import com.smallert.AbstractFactory.IUser;

public class AccessUser implements IUser {
    @Override
    public void insert() {
        System.out.println("向Access中添加一个用户");
    }
}
