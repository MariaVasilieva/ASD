package org.example.Lab_1_1;

public class LinkedStack <T>{
    class Node <T>{
        T data;
        Node<T> prev;
        public Node(T data){
            this.data = data;
        }
    }
    private Node top;
    public void push(T data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.prev = top;
            top = newNode;
        }
    }
    public T pop(){
        if(top == null){
            return null;
        }
        T toDelete = (T) top.data;
        top = top.prev;
        return toDelete;
    }
}
