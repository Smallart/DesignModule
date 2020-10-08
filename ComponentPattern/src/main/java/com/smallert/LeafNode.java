package com.smallert;

import java.util.List;

public class LeafNode extends Node{
    public LeafNode(String name) {
        super(name);
    }

    @Override
    public List<Node> add(Node node) {
        //不做任何事情
        return null;
    }

    @Override
    public void remove(Node node) {
        //不做任何事情
    }

    @Override
    public void display(int depth) {
        for (int i =0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
    }
}
