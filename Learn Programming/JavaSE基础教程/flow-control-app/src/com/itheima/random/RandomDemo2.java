package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入0-100中的数据");
            int guessNumber = sc.nextInt();
            if (guessNumber < luckNumber) {
                System.out.println("小了");
            } else if (guessNumber > luckNumber) {
                System.out.println("大了");
            } else {
                System.out.println("正确");
                break;
            }
        }
    }
}
