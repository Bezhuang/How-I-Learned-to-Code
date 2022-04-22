package com.itheima.loop;

public class ForDemo3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            int sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花个数为" + count);
    }
}
