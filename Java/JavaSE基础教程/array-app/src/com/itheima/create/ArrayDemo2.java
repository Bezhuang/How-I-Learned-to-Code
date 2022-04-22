package com.itheima.create;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] ages = {12, 24, 36};
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        ages[2] = 100;
        System.out.println(ages[2]);
        System.out.println(ages.length);
    }
}
