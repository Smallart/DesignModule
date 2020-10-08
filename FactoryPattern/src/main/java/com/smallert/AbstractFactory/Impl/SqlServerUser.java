package com.smallert.AbstractFactory.Impl;

import com.smallert.AbstractFactory.IUser;

public class SqlServerUser implements IUser {
    @Override
    public void insert() {
        System.out.println("向sqlServer数据库中添加一个用户");
    }
}
