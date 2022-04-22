package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 先声明后使用
        int a = 21;
        System.out.println(a);
        // 变量在{}中有效
        {
            int b = 25;
            System.out.println(b);
        }
//        System.out.println(b); 无效
        char ch = 'a';
        System.out.println(ch + 1);
//      二进制
        int i1 = 0B01100011;
        System.out.println(i1);
//        十六进制
        int i2 = 0X67;
        System.out.println(i2);
    }
}
