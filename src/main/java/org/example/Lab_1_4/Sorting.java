package org.example.Lab_1_4;

public class Sorting {
    public static void bubbleSort(Student[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }//n^2
    }
    public static void quickSort(Student[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(Student[] arr, int left, int right) {
        if(left < right) {
            int pivotIndex = partition(arr,left,right);
            quickSort(arr,left,pivotIndex-1);
            quickSort(arr,pivotIndex+1,right);
        }

    }
    private static int partition(Student[] arr, int left, int right) {
        Student pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if(arr[j].compareTo(pivot) < 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }
}
