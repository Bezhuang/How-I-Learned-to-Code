package com.itheima.constructor;

public class Car {
    String name;
    double price;

    public Car() {
        System.out.println("无参数构造器触发执行");
    }
    //有参数构造器
    public Car(String n, double p) {
        System.out.println("有参数构造器触发执行");
        name = n;
        price = p;
    }
}
