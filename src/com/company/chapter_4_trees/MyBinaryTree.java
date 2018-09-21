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

        // linked list to hold node-list
        List<LinkedList<TreeNode>> levels = new ArrayList<LinkedList<TreeNode>>();

        // adjacency list
        List<TreeNode> adj_queue = new ArrayList<TreeNode>();

        adj_queue.add(this.head);
        int level = 0;
        LinkedList<TreeNode> curr = new LinkedList<TreeNode>();

        //BFS
        while(adj_queue.size() != 0){

            if(levels.get(level) == null){
                curr = new LinkedList<TreeNode>(){{ add(adj_queue.remove(0));}};
                levels.add(curr);
            } else {
                curr.add(adj_queue.remove(0));
            }

            if(adj_queue.size() == 0){
                curr.forEach(node -> {
                    adj_queue.add(node.getLeft());
                    adj_queue.add(node.getRight());
                });
                curr = null;
                level++;
            }
        }
    }


    public void isTreeBalanced(){
        //BFS
        // return Math.abs(heightL -heightR) ? false : true; 1
    }

    public int treeHeight(TreeNode top, int height){

        if(top == null){
            return height;
        }
        return Math.max(treeHeight(top.getLeft(), height+1), treeHeight(top.getRight(), height+1);)
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
