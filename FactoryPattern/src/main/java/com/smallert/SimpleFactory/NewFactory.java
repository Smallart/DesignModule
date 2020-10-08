package com.smallert.SimpleFactory;

import com.smallert.SimpleFactory.domin.Car;
import com.smallert.SimpleFactory.domin.Computer;

public class NewFactory {
    public Car createCar(){
        return new Car();
    }
    public Computer createComputer(){
        return new Computer();
    }
}
