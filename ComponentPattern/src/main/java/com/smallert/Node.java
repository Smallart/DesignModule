package com.smallert;

import java.util.List;

public abstract class Node {

    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public abstract List<Node> add(Node node);
    public abstract void remove(Node node);
    public abstract void display(int depth);
}
