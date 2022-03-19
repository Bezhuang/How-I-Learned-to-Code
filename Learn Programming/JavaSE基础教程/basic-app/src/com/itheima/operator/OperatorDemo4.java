package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //赋值运算符，隐含了强制类型转化
        int a = 10;
        double b = 20.01;
        a += b; //a=(int)(a+b)
        System.out.println(a);
        b %= 2;
        System.out.println(b);
    }
}
