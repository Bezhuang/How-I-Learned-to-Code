package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //逻辑运算符
        double size = 9.8;
        double storage = 16;
        System.out.println(size <= 1 | storage > 1);
        System.out.println(size >= 8 & storage <= 18);
        System.out.println(!true);
        System.out.println(true ^ false);
        //短路与、短路或
        System.out.println(size >= 8 && ++storage <= 18); //左边为false右边不执行
        System.out.println(size <= 1 || --storage > 1);  //左边为true右边不执行
    }
}
