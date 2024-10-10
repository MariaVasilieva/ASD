package org.example.Lab_1_1;

public class List {
    private String [] arr;
    private int last;
    public List(int size) {
        arr = new String[size];
        last = -1;
    }
    public List() {
        arr = new String[10];
        last = -1;
    }
    public boolean add(String s) {
        if(isFull()){
            System.out.println("List is Full");
            return false;
        }
        arr[++last] = s;
        return true;
    }
    public boolean insert(int index, String s) {
        if(index<0 || index>last+1){
            System.out.println("Index out of bounds");
            return false;
        }
        for (int i = last; i >= index ; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = s;
        last++;
        return true;
    }
    public String remove(int index) {
        if(index<0 || index>last){
            System.out.println("Index out of bounds");
            return null;
        }
        String s = arr[index];
        for (int i = index; i < last; i++) {
            arr[i] = arr[i+1];
        }
        arr[last] = null;
        last--;
        return s;
    }
    private boolean isFull(){
        return last == arr.length-1;
    }
}
