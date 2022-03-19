package com.itheima.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("心跳检测");
        int heartbeat = sc.nextInt();
        if (heartbeat < 60 || heartbeat > 100) {
            System.out.println("心跳数据是 " + heartbeat + "，您可能需要进一步检查!");
        }
        System.out.println("检查结束");
        System.out.println("发红包");
        double money = sc.nextDouble();
        if (money >= 1314) {
            System.out.println("您当前发送红包成功");
        } else {
            System.out.println("您自己都没钱就别发了");
        }
        System.out.println("成绩单");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 70) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
