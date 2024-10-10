package org.example.Lab_1_3;

import java.util.ArrayList;

public class BinaryTree {
    private Node root;
    public void insert(Student data) {
        root = insertRec(root,data);
    }
    private Node insertRec(Node current, Student data) {
        if(current == null) {
            return new Node(data);
        }
        else {
            if(data.getId()<current.data.getId()) {
                current.left = insertRec(current.left,data);
            }
            else{
                current.right = insertRec(current.right,data);
            }
        }
        return current;
    }
    public ArrayList search(){
        ArrayList<Student> students = new ArrayList<>();
        if(root == null) {
            System.out.println("Tree is empty");
            return students;
        }
        searchRec(root,students);
        return students;
    }
    private void searchRec(Node current, ArrayList<Student> students) {
        if(current != null) {
            searchRec(current.left,students);
            if(current.data.getAge()>=18){
                students.add(current.data);
            }
            searchRec(current.right,students);
        }
    }
    public void display() {
        preOrder(root);
    }
    private void inOrder(Node current) {
        if(current != null) {
            inOrder(current.left);
            System.out.println(current.data);
            inOrder(current.right);
        }
    }
    private void postOrder(Node current) {
        if(current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.println(current.data);
        }
    }
    private void preOrder(Node current) {
        if(current != null) {
            System.out.println(current.data);
            preOrder(current.left);
            preOrder(current.right);
        }
    }
}
