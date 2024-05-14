package org.example;

public class ArrayTools {
    public static int getmax(int[] arr1) {
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        return max;
    }

    public static int getmin(int[] arr1) {
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        return min;
    }

    public static void printArray(int[] arr1) {
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i < arr1.length - 1) {
                System.out.print(arr1[i] + ", ");
            }
            System.out.println("]");
        }
    }
}