package com.itheima.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
//        三元运算符
        double score = 78;
        String s = score >= 60 ? "考试通过" : "挂科";
        System.out.println(s);
//        找最大值
        int a = 10, b = 20, c = 50;
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(max);
    }
}
