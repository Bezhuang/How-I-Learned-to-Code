package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 键盘输入
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            System.out.println("请输入您的名字");
            String name = sc.next();
            System.out.println("您的年龄是" + age + '\t' + "您的名字是" + name);
        }
    }
}
