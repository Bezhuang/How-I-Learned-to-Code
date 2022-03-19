package com.itheima.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        // 强制类型转化，可能出现数据丢失
        int a = 20;
        byte b = (byte) a;
        System.out.println(b);
    }
}
