package com.itheima.param;

public class Test1 {
    public static void main(String[] args) {
        int[] ages = {10, 20, 30, 40};
        int[] numbers = {1, 2, 3, 9, 10};
        printArray(ages);
        System.out.println();
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}
