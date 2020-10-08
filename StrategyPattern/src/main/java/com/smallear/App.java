package com.smallear;

import com.smallear.Strategy.OperateType;
import com.smallear.Strategy.StrategyManage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StrategyManage strategyManage = new StrategyManage(OperateType.MuTIL);
        System.out.println(strategyManage.calculateNumbers(1,2));
    }
}
