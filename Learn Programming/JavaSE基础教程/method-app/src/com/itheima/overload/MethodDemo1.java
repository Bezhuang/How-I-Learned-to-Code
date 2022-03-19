package com.itheima.overload;

public class MethodDemo1 {
    public static void main(String[] args) {
        fire();
        fire("岛国");
        fire("岛国", 10);
    }

    public static void fire() {
        fire("米国");
    }

    public static void fire(String location) {
        fire(location, 1);
    }

    public static void fire(String location, int number) {
        System.out.println("默认发射" + number + "枚武器给" + location);
    }

}
