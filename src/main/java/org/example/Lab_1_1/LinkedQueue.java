package org.example.Lab_1_1;

public class LinkedQueue <T>{
    class Node <T>{
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    public void enqueue(T data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public T dequeue(){
        if(head == null){
            return null;
        }
        if(head == tail){
            tail = null;
        }
        T toDelete = (T)head.data;
        head = head.next;
        return toDelete;
    }
}
