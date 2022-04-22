package com.itheima.param;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {10, 20, 30, 40};
        int[] arr4 = {10, 20, 40};
        System.out.println(compare(arr1, arr2));
        System.out.println(compare(arr1, arr3));
        System.out.println(compare(arr1, arr4));
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
