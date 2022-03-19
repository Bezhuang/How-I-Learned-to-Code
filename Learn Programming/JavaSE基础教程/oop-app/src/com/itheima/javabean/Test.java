package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        User u = new User();
        u.setName("吴彦祖");
        u.setHeight(185.5);
        u.setSalary(1000);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());

        User u2 = new User("关之琳", 165.5, 500);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
