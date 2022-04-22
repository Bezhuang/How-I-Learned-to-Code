package com.itheima.traverse;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] money = {16, 32, 8, 100, 78};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
    }
}
