package com.smallert.AbstractFactory.Impl;

import com.smallert.AbstractFactory.IDepartment;

public class AccessDepartment implements IDepartment {
    @Override
    public void search() {
        System.out.println("在Access数据库中添加一个Department");
    }
}
