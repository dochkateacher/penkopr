package com.clouway.intro.tree2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 20:05
 * To change this template use File | Settings | File Templates.
 */
public class DepthFirstTreeIterator implements Iterator<Node> {

        private LinkedList<Node> list;

        public DepthFirstTreeIterator(HashMap <Object, Node >tree, Object identifier) {
            list = new LinkedList<Node>();

            if (tree.containsKey(identifier)) {
                this.buildList(tree, identifier);
            }
        }

        private void buildList(HashMap<Object, Node> tree, Object identifier) {
            list.add(tree.get(identifier));
            ArrayList<Object> children = tree.get(identifier).getChildren();
            for (Object child : children) {

                // Recursive call
                this.buildList(tree, child);
            }
        }

        @Override
        public boolean hasNext() {
            return !list.isEmpty();
        }

        @Override
        public Node next() {
            return list.poll();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

