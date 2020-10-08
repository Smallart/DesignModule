package com.smaller;

public class BuilderManager {
    private MapBuilder builder;

    public BuilderManager(MapBuilder builder) {
        this.builder = builder;
    }

    /**
     * 这样一个顺序是因为如何是绘画的话，最先话的会在最上一层，雨林可以覆盖坦克
     */
    public void Build(){
        builder.createIceField();
        builder.createTank();
        builder.createForest();
    }
}
