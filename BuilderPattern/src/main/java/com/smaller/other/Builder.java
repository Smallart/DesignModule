package com.smaller.other;

public class Builder {
    private StringBuffer sb = new StringBuffer();
    public Builder buildIceField(){
        sb.append("向地图中添加冰原地形  ");
        return this;
    }

    public Builder buildForest(){
        sb.append("向地图中添加雨林地形  ");
        return this;
    }

    public Builder buildTank(){
        sb.append("向地图中添加坦克  ");
        return this;
    }

    public StringBuffer build(){
        return sb;
    }

}
