package com.itheima.create;

public class MethodDemo1 {
    public static void main(String[] args) {
        int c1 = sum(10, 30);
        int c2 = sum(10, 50);
        System.out.println(c1);
        System.out.println(c2);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
