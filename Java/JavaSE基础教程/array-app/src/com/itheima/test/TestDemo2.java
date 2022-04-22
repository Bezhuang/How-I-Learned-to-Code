package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
        int[] data = new int[5];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(20) + 1;
        }
        Scanner scanner = new Scanner(System.in);
        OUT:
        while (true) {
            int guessData = scanner.nextInt();
            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessData) {
                    System.out.println(i + "yes" + guessData);
                    break OUT;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
