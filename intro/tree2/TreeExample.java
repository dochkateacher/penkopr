package com.clouway.intro.tree2;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-19
 * Time: 19:44
 * To change this template use File | Settings | File Templates.
 */
public class TreeExample {

    public static void main(String[] args) {
        Treel<Integer> tree =

                new Treel<Integer>(1,

                        new Treel<Integer>(3,

                                new Treel<Integer>(1),

                                new Treel<Integer>(12),

                                new Treel<Integer>(31)),

                        new Treel<Integer>(21),

                        new Treel<Integer>(14,

                                new Treel<Integer>(23),

                                new Treel<Integer>(6))

                );



        // Traverse and print the tree using Depth-First-Search

        tree.printDFS();



        // Console output:

        // 7

        //    19

        //     1

        //     12

        //     31

        //    21

        //    14

        //     23

        //     6
    }
}
