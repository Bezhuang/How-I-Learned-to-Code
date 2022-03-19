package com.itheima.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 自动类型转换，类型范围小变量自动换为类型范围大的变量
        byte a = 20;
        int b = a; // 发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        int age = 23;
        double db = age;
        System.out.println(db);
        char ch = 'a';
        int it = ch;
        double db2 = ch;
        System.out.println(it);
        System.out.println(db2);
    }
}
