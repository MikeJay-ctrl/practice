package com.company.chapter_2_linked;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by michaeljames on 02/09/2018.
 */
public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> end;
    private Long length  = 0l;


    public MyLinkedList(){
    }


    public MyLinkedList(T [] input){
        if(input == null || input.length == 0)
            return;

        for(T item: input){
            this.add(item);
        }
    }

    public T add(T add){
        return this.addNode(add).data;
    }

    private Node<T> addNode(T item){
        this.length ++;
        if(this.head == null) {
            this.head = new Node(item);
            this.end = this.head;
            return this.head;
        }
        /*
        if there is no this.end
        
        Node<T> runner = this.head;
        while(runner != null){
            if(runner.next != null){
                runner = runner.next;
            } else {
                break;
            }
        }
        runner.next = new Node(item);
        */
        this.end.next = new Node(item);
        Node<T> current = this.end;

        this.end = this.end.next;
        return current;
    }



    public T remove(int index) throws Exception {
        if(index > this.length-1){
            throw new Exception("Index Out of Bounds Exception");
        }
        
        this.length --;
        Node<T> current = this.head;
        Node<T> prev = null;
        
        int currentIdx = 0;
        while(currentIdx < index){
            prev = current;
            current = current.next;
            currentIdx++;
        }

        prev.next = current.next;
        return current.data;

    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        Node<T> current = this.head;
        while(current != null){
            sb.append("|" + current.data + "|");
            current = current.next;
            if(current != null)
                sb.append(" --> ");
        }
        return sb.toString();
    }

    public T get(int index){
        Node<T> current = this.head;
        int currentIdx = 0;

        while(current != null){
            if(currentIdx == index){
                break;
            }
            current = current.next;
            currentIdx++;
        }
        return current.data;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }




    public class Node<T> {

        private T data;
        private Node next;

        private T get(){
            return this.data;
        }

        private Node getNext(){
            return this.next;
        }

        public Node(T data){
            this.data = data;
            this.next = null;
        }

        @Override
        public boolean equals(Object that) {

            if(!( that instanceof Node))
                return false;

            return ((Node) that).get() == this.get() && ((Node) that).getNext() == this.getNext();
        }



    }

}
