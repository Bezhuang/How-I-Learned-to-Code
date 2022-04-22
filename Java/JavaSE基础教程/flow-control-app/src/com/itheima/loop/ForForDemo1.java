package com.itheima.loop;

public class ForForDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "天");
            for (int j = 0; j < 3; j++) {
                System.out.println("520");
            }
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
