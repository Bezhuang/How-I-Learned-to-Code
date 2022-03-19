package com.itheima;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("请输入需要加密的数字个数");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入需要加密的第" + (i + 1) + "个数字");
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
        System.out.println();
    }
}
