package com.itheima.create;

public class MethodAttentionDemo1 {
    public static void main(String[] args) {
        //方法与方法之间是平行关系，不能嵌套定义
        System.out.println(sum(2, 3));
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
