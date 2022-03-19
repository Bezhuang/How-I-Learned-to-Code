package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int data = r.nextInt(10) + 5;
            System.out.println(data);
        }
    }
}
