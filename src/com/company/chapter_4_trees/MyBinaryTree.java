package com.company.chapter_4_trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by michaeljames on 16/09/2018.
 */
public class MyBinaryTree<T> {

    TreeNode head = null;


    public MyBinaryTree(){

    }

    public MyBinaryTree(T data){
        head = new TreeNode(data);
    }

    public MyBinaryTree(List<T> data){
        if(data.size() <= 0)
            return;

        this.buildTree(data);
    }


    public void buildTree(List<T> data){

        // find head
        if(this.head == null)
            this.head = new TreeNode(data.get(0));

        TreeNode scanner = this.head;

        for(int index = 1; index < data.size(); index++){
            T val = data.get(index);

            if(scanner.left == null) {
                scanner.setLeft(new TreeNode(val));

            } else if (scanner.right == null) {
                scanner.setRight(new TreeNode(val));
                scanner = scanner.getLeft();
            }

        }
    }

    public void inOrderTraversal(){
        this.inOrderTraversal(this.head);
    }

    private void inOrderTraversal(TreeNode scanner){
        if(scanner == null)
            return;


        System.out.println(scanner.data + "-->" + scanner.getLeft().get() + "-->" + scanner.getRight().get());
        this.inOrderTraversal(scanner.getLeft());
        this.inOrderTraversal(scanner.getRight());

    }

    public void levels(){

        List<LinkedList<TreeNode>> levels = new ArrayList<LinkedList<TreeNode>>();
        Queue<TreeNode> visited = new Queue<TreeNode>();
        ArrayList<TreeNode> unVisited = new ArrayList<TreeNode>();

        visited.add(this.head);

        while(!visited.isEmpty()){
            TreeNode top = visited.element();

            visited.add(top.getLeft());
            visited.add(top.getRight());

            // add level
            LinkedList<TreeNode> l = new LinkedList<TreeNode>() {{ add(top);}};
            levels.add(l);


        }


    }



    public class TreeNode <T>{

        public TreeNode(T data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public T data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode getLeft(){
            return this.left;
        }


        public TreeNode getRight(){
            return this.right;
        }

        public T get(){
            return this.data;
        }

        public void set(T data){
            this.data = data;
        }

        public void setLeft(TreeNode node){
            this.left = node;
        }

        public void setRight(TreeNode node){
            this.right = node;
        }


    }
}
