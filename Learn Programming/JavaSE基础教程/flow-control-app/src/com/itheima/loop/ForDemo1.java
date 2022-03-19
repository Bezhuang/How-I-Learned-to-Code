package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
        for (int j = 1; j <= 5; j += 2) {
            System.out.println("Hello, World");
        }
        int sum = 0;
        for (int count = 1; count <= 5; count++) {
            sum += count;
        }
        System.out.println(sum);
    }
}
