package org.example.Lab_1_2;

public class HashTable {
    private Student[] arr;
    private int size;
    public HashTable(int size) {
        arr = new Student[size];
        this.size = size;
    }
    private int hashFunction(int key) {
        return key % size;
    }
    public Student get(int key) {
        int index = hashFunction(key);
        if(arr[index] != null && arr[index].getId()==key) {
            return arr[index];
        }
        else if (arr[index] != null) {
            for (int i = 1; i < size; i++) {
                int newIndex = (index+i)%size;
                if(arr[newIndex]!=null && arr[newIndex].getId()==key){
                    return arr[newIndex];
                }
            }
        }
        System.out.println("No element was found!");
        return null;
    }
    public boolean insert(Student s) {
        int index = hashFunction(s.getId());
        if (arr[index] == null) {
            arr[index] = s;
            return true;
        }
        else if(!s.equals(arr[index])) {
            return collision(index, s);
        }
        return false;
    }
    private boolean collision(int index, Student s) {
        for (int i = 1; i < size; i++) {
            int newIndex = (index+i)%size;
            if(arr[newIndex]==null){
                arr[newIndex] = s;
                return true;
            }
            if (arr[newIndex].equals(s)) {
                return false;
            }
        }
        return false;
    }
    public void print() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("index:"+i+" " +arr[i].toString());
            }
        }
    }
}
