package com.itheima.memory;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "睡觉、游戏";
        s1.study();
        Student s2 = s1;
        s2.hobby = "爱提问";
        s2.study();
        s1.study();
    }
}
