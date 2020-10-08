package com.smallear.staticpattern;

import com.smallear.Moveable;
import com.smallear.domin.Tank;

public class proxy implements Moveable {
    private Tank tank;

    public proxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("工兵排雷");
        tank.move();
        System.out.println("工兵修复");
    }
}
