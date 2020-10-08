package com.smallart;

public class Location implements Cloneable{
    private String address;

    public Location(String address) {
        this.address = address;
    }

    @Override
    public Location clone() throws CloneNotSupportedException {
        return (Location) super.clone();
    }
}
