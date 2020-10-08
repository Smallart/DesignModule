package com.smallart;

public class CatFactory implements Factory {
    @Override
    public Animal birth() {
        return new Cat();
    }
}
