package com.clouway.intro.tree2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */

    public class Tree {

        private final static int ROOT = 0;

        private HashMap<Object,Node> nodes;
        private TraversalStrategy traversalStrategy;

        // Constructors
        public Tree() {
            this(TraversalStrategy.DEPTH_FIRST);
        }

        public Tree(TraversalStrategy traversalStrategy) {
            this.nodes = new HashMap<Object, Node>();
            this.traversalStrategy = traversalStrategy;
        }

        // Properties
        public HashMap<Object, Node> getNodes() {
            return nodes;
        }

        public TraversalStrategy getTraversalStrategy() {
            return traversalStrategy;
        }

        public void setTraversalStrategy(TraversalStrategy traversalStrategy) {
            this.traversalStrategy = traversalStrategy;
        }

        // Public interface
        public Node addNode(Object identifier) {
            return this.addNode(identifier, null);
        }

        public Node addNode(Object identifier, Object parent) {
            Node node = new Node(identifier);
            nodes.put(identifier, node);

            if (parent != null) {
                nodes.get(parent).addChild(identifier);
            }

            return node;
        }

        public void display(Object identifier) {
            this.display(identifier, ROOT);
        }

        public void display(Object identifier, int depth) {
            ArrayList<Object> children = nodes.get(identifier).getChildren();

            if (depth == ROOT) {
                System.out.println(nodes.get(identifier).getIdentifier());
            } else {
                String tabs = String.format("%0" + depth + "d", 0).replace("0", "    "); // 4 spaces
                System.out.println(tabs + nodes.get(identifier).getIdentifier());
            }
            depth++;
            for (Object child : children) {

                // Recursive call
                this.display(child, depth);
            }
        }

        public Iterator<Node> iterator(Object identifier) {
            return this.iterator(identifier, traversalStrategy);
        }

        public Iterator<Node> iterator(Object identifier, TraversalStrategy traversalStrategy) {
            return traversalStrategy == TraversalStrategy.BREADTH_FIRST ?
                    new BreadthFirstTreeIterator(nodes, identifier) :
                    new DepthFirstTreeIterator(nodes, identifier);
        }
    }




