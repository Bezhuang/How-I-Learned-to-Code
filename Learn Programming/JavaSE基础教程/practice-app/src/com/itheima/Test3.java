package com.itheima;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        while (true) {
            String code = creatCode(5);
            System.out.println("随机验证码" + code);
        }
    }

    public static String creatCode(int n) {
        String code = "";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    char ch = (char) (random.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    char ch1 = (char) (random.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    code += random.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
