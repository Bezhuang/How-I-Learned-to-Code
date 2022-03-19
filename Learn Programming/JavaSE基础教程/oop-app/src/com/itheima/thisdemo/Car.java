package com.itheima.thisdemo;

public class Car {
    String name;
    double price;

    //有参数构造器
    public Car(String name, double price) {
        System.out.println("有参数构造器触发执行");
        this.name = name;
        this.price = price;
    }

    public void goWith(String name) {
        System.out.println(this.name + "正在和" + name + "比赛");
    }
}
