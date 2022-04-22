package com.itheima.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
//      字节型 最大 0-127
        byte number = 98;
        System.out.println(number);
//      短整型 2字节
        short money = 30000;
        System.out.println(money);
//        整型 4字节
        int it = 203948374;
        System.out.println(it);
//        长整型 8字节
        long lg = 182371947343432L;   //结尾加L
        System.out.println(lg);
//        单精度浮点型 4字节
        float score = 98.5f;  //结尾加f
        System.out.println(score);
//        双精度浮点型 8字节
        double score2 = 9384.34244;
        System.out.println(score2);
//        字符
        char ch = 's';
        System.out.println(ch);
//    布尔类型
        boolean bool = false;
        System.out.println(bool);
//        引用数据类型——字符串
        String name = "西门吹雪";
        System.out.println(name);
    }
}
