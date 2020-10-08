package com.smallert.SimpleFactory;

import com.smallert.SimpleFactory.comman.ProductionType;
import com.smallert.SimpleFactory.domin.Car;
import com.smallert.SimpleFactory.domin.Computer;
import com.smallert.SimpleFactory.domin.Production;

public class Factory {
    public Production createProduction(ProductionType type){
        Production production = null;
        switch(type){
            case CAR:
                production = new Car();
                break;
            case COMPUTER:
                production = new Computer();
                break;
        }
        return production;
    }
}
