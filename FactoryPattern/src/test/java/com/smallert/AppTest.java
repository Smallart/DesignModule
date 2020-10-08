package com.smallert;

import static org.junit.Assert.assertTrue;

import com.smallert.AbstractFactory.IDepartment;
import com.smallert.AbstractFactory.IFactory;
import com.smallert.AbstractFactory.Impl.AccessFactory;
import com.smallert.AbstractFactory.Impl.SqlServerFactory;
import com.smallert.AbstractFactory.amendment.reflect.GetConfigParamUtil;
import com.smallert.AbstractFactory.amendment.reflect.ReflectFactory;
import com.smallert.AbstractFactory.amendment.simple.FactoryType;
import com.smallert.AbstractFactory.amendment.simple.SimpleFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
   public void abstractFactoryTest(){
        IFactory sqlServerFactory = new SqlServerFactory();
        sqlServerFactory.createUser().insert();
        sqlServerFactory.createDepartment().search();

        IFactory accessFactory = new AccessFactory();
        accessFactory.createDepartment().search();
        accessFactory.createUser().insert();
   }

   @Test
   public void amendAbstractFactoryTest(){
       SimpleFactory simpleFactory = new SimpleFactory();
       IDepartment department = simpleFactory.createDepartment(FactoryType.SQLSERVER);
       department.search();
       IDepartment department1 = simpleFactory.createDepartment(FactoryType.ACCESS);
       department1.search();
   }

   @Test
   public void amendmentAbstractFactoryWithReflect(){
       ReflectFactory reflectFactory = new ReflectFactory();
       reflectFactory.createDepartment((String)GetConfigParamUtil.get("SqlServerDepartment")).search();
   }
}
