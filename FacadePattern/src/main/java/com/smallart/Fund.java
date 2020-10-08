package com.smallart;

public class Fund {
    private Stack1 stack1;
    private Stack2 stack2;

    public Fund() {
        stack1 = new Stack1();
        stack2 = new Stack2();
    }

    public void buy(){
        stack1.buy();
        stack2.buy();
    }

    public void sell(){
        stack1.sell();
        stack2.sell();
    }
}
