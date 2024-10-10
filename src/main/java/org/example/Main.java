package org.example;

import org.example.Lab_1_4.Sorting;
import org.example.Lab_1_4.Student;


public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[100_000];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i,"Student"+i,(int)(Math.random()*10 + 20));
        }
        Sorting.bubbleSort(students);
        Sorting.quickSort(students);
    }
}