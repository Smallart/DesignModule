package com.smallert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Branch root = new Branch("root");
        LeafNode leafA = new LeafNode("leafA");
        LeafNode leafB = new LeafNode("leafB");
        root.add(leafA).add(leafB);
        Branch branchX = new Branch("branchX");
        LeafNode leafXA = new LeafNode("leafXA");
        LeafNode leafXB = new LeafNode("leafXB");
        branchX.add(leafXA).add(leafXB);
        root.add(branchX);
        root.display(1);
    }
}
