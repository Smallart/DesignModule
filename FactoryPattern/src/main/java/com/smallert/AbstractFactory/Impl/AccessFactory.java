package com.smallert.AbstractFactory.Impl;

import com.smallert.AbstractFactory.IDepartment;
import com.smallert.AbstractFactory.IFactory;
import com.smallert.AbstractFactory.IUser;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
