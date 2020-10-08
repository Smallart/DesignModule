package com.smallert.AbstractFactory.amendment.simple;

import com.smallert.AbstractFactory.IDepartment;
import com.smallert.AbstractFactory.IUser;
import com.smallert.AbstractFactory.Impl.AccessDepartment;
import com.smallert.AbstractFactory.Impl.AccessUser;
import com.smallert.AbstractFactory.Impl.SqlServerDepartment;
import com.smallert.AbstractFactory.Impl.SqlServerUser;

public class SimpleFactory {
    public IUser createUser(FactoryType type){
        IUser user = null;
        switch (type){
            case ACCESS:
                user = new AccessUser();
                break;
            case SQLSERVER:
                user = new SqlServerUser();
                break;
        }
        return user;
    }
    public IDepartment createDepartment(FactoryType type){
        IDepartment department = null;
        switch (type){
            case SQLSERVER:
                department = new SqlServerDepartment();
                break;
            case ACCESS:
                department = new AccessDepartment();
                break;
        }
        return department;
    }
}
