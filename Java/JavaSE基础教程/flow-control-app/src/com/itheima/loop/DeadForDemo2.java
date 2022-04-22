package com.itheima.loop;

import java.util.Scanner;

public class DeadForDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int okPassword = 520;
        while (true) {
            System.out.println("请输入正确的密码");
            int password = sc.nextInt();
            if (password == okPassword) {
                System.out.println("登录成功");
                break;
            }
            System.out.println("密码错误");
        }
    }
}
