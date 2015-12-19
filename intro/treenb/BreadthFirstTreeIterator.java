package com.clouway.intro.tree2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 20:02
 * To change this template use File | Settings | File Templates.
 */
public class BreadthFirstTreeIterator implements Iterator<Node> {
    private static final int ROOT = 0;


        private LinkedList<Node> list;
        private HashMap<Object, ArrayList<Object>> levels;

    /**
     *
      * @param tree
     * @param identifier
     */
    public BreadthFirstTreeIterator(HashMap <Object, Node> tree, Object identifier) {
            list = new LinkedList<Node>();
            levels = new HashMap<Object, ArrayList<Object>>();

            if (tree.containsKey(identifier)) {
                this.buildList(tree, identifier, ROOT);

                for (Map.Entry<Object, ArrayList<Object>> entry : levels.entrySet()) {
                    for (Object child : entry.getValue()) {
                        list.add(tree.get(child));
                    }
                }
            }
        }

        private void buildList(HashMap<Object, Node> tree, Object identifier, int level) {
            if (level == ROOT) {
                list.add(tree.get(identifier));
            }

            ArrayList<Object> children = tree.get(identifier).getChildren();

            if (!levels.containsKey(level)) {
                levels.put(level, new ArrayList<Object>());
            }
            for (Object child : children) {
                levels.get(level).add(child);

                // Recursive call
                this.buildList(tree, child, level + 1);
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

