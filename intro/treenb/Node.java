package com.clouway.intro.tree2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    private Object identifier;
    private ArrayList<Object> children;

    // Constructor
    public Node(Object identifier) {
        this.identifier = identifier;
        children = new ArrayList<Object>();
    }

    // Properties
    public Object getIdentifier() {
        return identifier;
    }

    public ArrayList<Object> getChildren() {
        return children;
    }

    // Public interface
    public void addChild(Object identifier) {
        children.add(identifier);
    }
}
