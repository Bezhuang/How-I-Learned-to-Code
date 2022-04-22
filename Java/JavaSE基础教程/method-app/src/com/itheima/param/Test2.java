package com.itheima.param;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 66, 87, 19};
        System.out.println(searchIndex(arr, 87));
    }

    public static int searchIndex(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
