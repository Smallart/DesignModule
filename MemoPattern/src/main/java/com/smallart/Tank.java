package com.smallart;

public class Tank {
    private int speed;

    public Tank(int speed) {
        this.speed = speed;
    }

    public Memo backUp(){
        return new Memo(speed);
    }

    public void enhanceSpeed(int speed){
        this.speed+=speed;
    }

    public void back(Memo memo){
        this.speed = memo.getSpeed();
    }

    public int getSpeed() {
        return speed;
    }
}
