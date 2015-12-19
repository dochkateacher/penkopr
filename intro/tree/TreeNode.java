package com.clouway.intro.tree;
 import javax.swing.tree.DefaultMutableTreeNode;
 import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 12:11
 * To change this template use File | Settings | File Templates.
 */
    public  class TreeNode {

    private String data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String something){
        data = something;
        left = null;
        right = null;
    }

    // Accessors
    public String getData() {return data;}
    public void setData(String something){data = something;}

    public TreeNode getLeft() {return left;}
    public TreeNode getRight() {return right;}

    public void setLeft(TreeNode newleft){left = newleft;}
    public void setRight(TreeNode newright){right = newright;}

    // Insert in order
    public void insert(TreeNode newOne){
        if (this.data.compareTo(newOne.data) > 0){
            if (this.getLeft() == null)
            {this.setLeft(newOne);}
            else
            {this.getLeft().insert(newOne);}}
        else {
            if (this.getRight() == null)
            {this.setRight(newOne);}
            else
            {this.getRight().insert(newOne);}
        }
    }

    //In-Order Traversal
    public String traverse(){
        String returnValue = "";
        // Visit left
        if (this.getLeft() != null)
        {returnValue += " "+this.getLeft().traverse();}
        // Visit me
        returnValue += " "+this.getData();
        // Visit right
        if (this.getRight() != null)
        {returnValue += " "+this.getRight().traverse();}
        return returnValue;}

    //Pre-Order Traversal
    public String preOrder(){
        String returnValue = "";
        // Visit me
        returnValue += " "+this.getData();

        // Visit left
        if (this.getLeft() != null)
        {returnValue += " "+this.getLeft().traverse();}
        // Visit right
        if (this.getRight() != null)
        {returnValue += " "+this.getRight().traverse();}
        return returnValue;}

    //Post-Order Traversal
    public String postOrder(){
        String returnValue = "";

        // Visit left
        if (this.getLeft() != null)
        {returnValue += " "+this.getLeft().traverse();}
        // Visit right
        if (this.getRight() != null)
        {returnValue += " "+this.getRight().traverse();}

        // Visit me
        returnValue += " "+this.getData();
        return returnValue;
    }

    public TreeNode find(String someValue){
        if (this.getData().compareTo(someValue) == 0)
        {return this;}
        if (this.data.compareTo(someValue) > 0){
            if (this.getLeft() == null)
            {return null;}
            else
            {return this.getLeft().find(someValue);}}
        else {
            if (this.getRight() == null)
            {return null;}
            else
            {return this.getRight().find(someValue);}}
    }

    public String toString()
    {return
            "This:"+this.getData()+" Left: "+this.getLeft() +
                    " Right: "+this.getRight();}

    public void addFirst(TreeNode newOne){
        if (this.getLeft() == null)
        {this.setLeft(newOne);}
        else
        {this.getLeft().addFirst(newOne);}
    }

    public void addLast(TreeNode newOne){
        if (this.getRight() == null)
        {this.setRight(newOne);}
        else
        {this.getRight().addLast(newOne);}

    }
}

   /** public T data;
    public TreeNode<T> parent;
    public List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new LinkedList<TreeNode<T>>();
    }

    public TreeNode<T> addChild(T child) {
        TreeNode<T> childNode = new TreeNode<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }

    // other features ...





    /** private TreeNode left;
     private TreeNode right;
     private TreeNode parent;
     int item;

    // public static  linkToTree (Iterable<TreeNode> nodes)
     /**{
         this.left = left;
         this.right = right;
         this.parent = parent;
         this.item = item;
     }  **/

   /** public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        //this.left = left;
        this.left = left;
        left.parent = this;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
        right.parent=this;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }


   // public class Ebay {
   public static  TreeNode linkToTree (Iterable<TreeNode> nodes){
    TreeNode root;

    for (TreeNode node : nodes) {
        final TreeNode parent = node.getParent();

        // try to detect the root node
        if (parent == null) {
            root = node;
        }
        // add this node to the parent's left slot if it's empty
        else if (parent.getLeft() == null) {
            parent.setLeft(node);
        }
        // … else overwrite right slot
        else {
            parent.setRight(node);
        }
    }

    return root;
//}

   /** public Map<TreeNode, List<TreeNode>> getMap (List<TreeNode> listOfTreeNodes) {
        final Map<TreeNode, List<TreeNode>> map = new HashMap<TreeNode, List<TreeNode>>();
        for (TreeNode treeNode : listOfTreeNodes) {
            if (map.get(treeNode.getParent()) != null) {
                map.get(treeNode.getParent()).add(treeNode);
            } else {
                List<TreeNode> list = new ArrayList<TreeNode>();
                list.add(treeNode);
                map.put(treeNode.getParent(), list);
            }
        }
        return map;
    }

    public void soStuff (List<TreeNode> listOfTreeNode)  {

        final Map<TreeNode, List<TreeNode>> map = getMap (listOfTreeNode);
        root = map.get(null).get(0);

        constructTree ( map , root);
    }


    public TreeNode constructTree (Map<TreeNode, List<TreeNode>> map, TreeNode node) {
        if (map.containsKey(node)) {
            List<TreeNode> list = map.get(node);
            node.setLeft(constructTree(map, map.get(node).get(0)));
            if (list.size() == 2) {
                node.setRight(constructTree(map, map.get(node).get(1)));
            }
        }
        return node;
    }  **/



