package com.smaller;

public class MapTwo extends MapBuilder {
    @Override
    public void createForest() {
        System.out.println(paint+"画出雨林2");
    }

    @Override
    public void createTank() {
        System.out.println(paint+"画出坦克");
    }

    @Override
    public void createIceField() {
        System.out.println(paint+"画出冰原");
    }
}
