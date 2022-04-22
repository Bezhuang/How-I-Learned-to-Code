package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args) {
        int[] codes = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("输入工号" + (i + 1));
            codes[i] = scanner.nextInt();
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = random.nextInt(codes.length);
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
