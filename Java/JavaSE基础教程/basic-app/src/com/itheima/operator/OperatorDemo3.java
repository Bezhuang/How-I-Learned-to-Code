package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //自增、自减
        int a = 10;
        a++;    //在变量上自增、自减，不能在自变量上自增、自减
        System.out.println(a);
        --a;
        System.out.println(a);
        int i = 10;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);
        int k = j--;
        System.out.println(j);
        System.out.println(k);
    }
}
