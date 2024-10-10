package org.example.Lab_1_1;

public class Queue {
    private String [] arr;
    private int last;
    public Queue() {
        arr = new String[10];
        last = -1;
    }
    public Queue(int size) {
        arr = new String[size];
        last = -1;
    }
    public boolean enqueue(String item) {
        if(isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        arr[++last] = item;
        return true;
    }
    public String dequeue() {
        //FIFO
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String item = arr[last];
        for (int i = 0; i < last; i++) {
            arr[i] = arr[i+1];
        }
        arr[last] = null;
        last--;
        return item;
    }
    private boolean isFull(){
        return last == arr.length-1;
    }
    private boolean isEmpty(){
        return last == -1;
    }
}
