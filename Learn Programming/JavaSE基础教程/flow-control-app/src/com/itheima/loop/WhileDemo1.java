package com.itheima.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        double peekHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness <= peekHeight ) {
            count++;
            paperThickness *= 2;
        }
        System.out.println(count);
        System.out.println(paperThickness);
    }
}
