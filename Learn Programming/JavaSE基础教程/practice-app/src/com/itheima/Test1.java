package com.itheima;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("机票原价");
        double price = sc.nextDouble();
        System.out.println("月份");
        int month = sc.nextInt();
        System.out.println("仓位类型");
        String type = sc.next();
        double rs = calc(price, month, type);
        System.out.println("当前机票价格：" + rs);
    }

    public static double calc(double money, int month, String type) {
        if (month >= 0 && month <= 12) {
            if (month >= 5 && month <= 10) {
                switch (type) {
                    case "经济舱":
                        money *= 0.85;
                        break;
                    case "头等舱":
                        money *= 0.9;
                        break;
                    default:
                        System.out.println("您输入的仓位不正确");
                        money = -1;
                }
            } else {
                switch (type) {
                    case "经济舱":
                        money *= 0.65;
                        break;
                    case "头等舱":
                        money *= 0.7;
                        break;
                    default:
                        System.out.println("您输入的仓位不正确");
                        money = -1;
                }
            }
            return money;
        }
        System.out.println("您输入的月份不正确");
        return -1;
    }
}
