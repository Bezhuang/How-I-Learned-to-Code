package com.itheima.loop;

public class BreakandContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("洗碗");
            if (i == 2) {
                break;
            }
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("洗碗" + i);
        }
    }
}
