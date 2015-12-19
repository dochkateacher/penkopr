package com.clouway.intro.tree;

import java.awt.image.SampleModel;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 12:16
 * To change this template use File | Settings | File Templates.
 */
public class TreeExample {
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode("234");
        TreeNode node2 = new TreeNode("564");
        TreeNode node3 = new TreeNode("123");
        TreeNode node4 = new TreeNode("457");

       /** System.out.println(node1);
        node1.insert(node2);
        System.out.println(node1);
        node1.insert(node3);
        System.out.println(node1);
        node1.insert(node4);
        System.out.println(node1);  **/

        System.out.println(node1.traverse());
        System.out.println(node2.preOrder());
    }
    }
      /**  TreeNode<String> root = new TreeNode<String>("root");
        {
            TreeNode<String> node0 = root.addChild("node0");
            TreeNode<String> node1 = root.addChild("node1");
            TreeNode<String> node2 = root.addChild("node2");
            {
                TreeNode<String> node20 = node2.addChild(null);
                TreeNode<String> node21 = node2.addChild("node21");
                {
                    TreeNode<String> node210 = node21.addChild("node210");
                    TreeNode<String> node211 = node21.addChild("node211");
                }
            }
            TreeNode<String> node3 = root.addChild("node3");
            {
                TreeNode<String> node30 = node3.addChild("node30");
            }
        }

        TreeNode<String> treeRoot = SampleData.getSet1();
        for (TreeNode<String> node : treeRoot) {
            String indent = createIndent(node.getLevel());
            System.out.println(indent + node.data);

            TreeNode<String> treeRoot;
        treeRoot = SampleModel.getSet1();

        System.out.println("ooooooo" + root.children);


    }
          // TreeNode opr=new TreeNode() ;
        //System.out.println("tree" + opr.ExempleTreeModel());

    }
       /** Tree<Integer> tree=new Tree<Integer>(7,
                new Tree<Integer>(19,
                        new Tree<Integer>(1),
                        new Tree<Integer>(12),
                        new Tree<Integer>(31)),
                new Tree<Integer>(21),
                new Tree<Integer>(14,
                        new Tree<Integer>(23),
                        new Tree<Integer>(6))
    };
    tree.printDFS(); **/

