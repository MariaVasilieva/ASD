package org.example.Lab_1_1;

public class Stack {
    private String[] arr;
    private int last;

    public Stack() {
        arr = new String[10];
        last = -1;
    }
    public Stack(int size) {
        arr = new String[size];
        last = -1;
    }
    public boolean push(String item) {
        if(isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        arr[++last] = item;
        return true;
    }
    public String pop() {
        //LIFO
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        String tmp = arr[last];
        arr[last] = null;
        last--;
        return tmp;
    }
    private boolean isFull(){
        return last == arr.length - 1;
    }
    private boolean isEmpty(){
        return last == -1;
    }
    public void print(){
        for (int i = 0; i <= last; i++) {
            System.out.println(arr[i]);
        }
    }
}
