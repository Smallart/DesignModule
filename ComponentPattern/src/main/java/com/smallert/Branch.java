package com.smallert;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Node {
    private List<Node> nodeList = new ArrayList<>();

    public Branch(String name) {
        super(name);
    }

    @Override
    public List<Node> add(Node node) {
        nodeList.add(node);
        return nodeList;
    }

    @Override
    public void remove(Node node) {
        nodeList.remove(node);
    }

    @Override
    public void display(int depth) {
        for (int i =0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
        for (Node node : nodeList) {
            node.display(depth+1);
        }
    }
}
