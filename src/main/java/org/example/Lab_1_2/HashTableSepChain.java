package org.example.Lab_1_2;

public class HashTableSepChain {
    class Node {
        Student data;
        Node next;
        public Node(Student data) {
            this.data = data;
        }
    }
    private Node [] arr;
    private int size;
    public HashTableSepChain(int size) {
        arr = new Node[size];
        this.size = size;
    }
    private int hash(int key) {
        return key % size;
    }
    public boolean insert(Student data) {
        int index = hash(data.getId());
        if(arr[index] == null) {
            Node newNode = new Node(data);
            arr[index] = newNode;
            return true;
        }
        else {
            Node currentNode = arr[index];
            while(currentNode.next != null) {
                if(currentNode.data.equals(data)) {
                    return false;
                }
                currentNode = currentNode.next;
            }
            Node newNode = new Node(data);
            currentNode.next = newNode;
            return true;
        }
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            if(arr[i] != null) {
                Node currentNode = arr[i];
                while(currentNode != null) {
                    System.out.print("index "+i+ " " +currentNode.data + " ");
                    currentNode = currentNode.next;
                }
                System.out.println();
            }
        }
    }

}
