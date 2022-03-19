package com.itheima.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1-10的奇数和=" + sum);
    }
}
