package com.itheima.create;

public class ArrayDemo4 {
    public static void main(String[] args) {
//        int、char数组默认值为0
        char[] chars = new char[100];
        System.out.println((int) chars[1]);
//        浮点数数组默认值为0.0
        double[] doubles = new double[100];
        System.out.println(doubles[1]);
//        boolean数组默认值为false
        boolean[] booleans = new boolean[100];
        System.out.println(booleans[4]);
//       引用类型数组默认值为null
        String[] strings = new String[80];
        System.out.println(strings[77]);
    }
}
