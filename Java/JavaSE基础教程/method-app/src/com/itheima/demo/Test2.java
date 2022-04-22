package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        int[] ages = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getArrayMaxData(ages));
    }

    public static int getArrayMaxData(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
