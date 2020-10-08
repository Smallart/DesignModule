package com.smallert.AbstractFactory.Impl;

import com.smallert.AbstractFactory.IDepartment;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void search() {
        System.out.println("在SqlServer数据库中添加一个Department");
    }
}
