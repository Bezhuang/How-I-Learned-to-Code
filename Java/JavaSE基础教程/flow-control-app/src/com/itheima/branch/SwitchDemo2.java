package com.itheima.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String weekday = "周日";
        switch (weekday) {
            case "周六":
                System.out.println("加班加点，解决bug");
                break;
            case "周日":
                System.out.println("相亲");
                break;
            default:
                System.out.println("埋头苦干，解决bug");
        }
    }
}
