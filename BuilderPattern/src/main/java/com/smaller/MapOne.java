package com.smaller;

public class MapOne extends MapBuilder {
    @Override
    public void createForest() {
        System.out.println(paint+"画出雨林1");
    }

    @Override
    public void createTank() {
        System.out.println(paint+"画出坦克");
    }

    @Override
    public void createIceField() {
        System.out.println(paint+"画出冰原1");
    }
}
