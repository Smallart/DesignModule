package com.smallart;

public class DogFactory implements Factory {
    @Override
    public Animal birth() {
        return new Dog();
    }
}
