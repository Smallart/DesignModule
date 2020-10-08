package com.smallart;

public class ProtectDecorate extends Decorate{

    public ProtectDecorate(GameObject gameObject) {
        super(gameObject);
    }

    @Override
    public void paint() {
        System.out.println("装甲装甲装甲");
        System.out.print("装甲");
        gameObject.paint();
        System.out.println("装甲");
        System.out.println("装甲装甲装甲");
    }
}
