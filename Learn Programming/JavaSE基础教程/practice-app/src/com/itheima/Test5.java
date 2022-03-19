package com.itheima;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int max = scores[0], min = scores[0], sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
        }
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        double result = (sum - max - min) * 1.0 / (scores.length - 2);
        System.out.println("选手最终得分：" + result);
    }
}
