package com.itheima.javabean;

import java.util.Scanner;

public class ShopCartTest {
    public static void main(String[] args) {
        Goods[] shopCart = new Goods[100];
        while (true) {
            System.out.println("选择如下命令进行操作：");
            System.out.println("添加商品：add");
            System.out.println("查看商品：query");
            System.out.println("修改数量：update");
            System.out.println("结算价格：pay");
            System.out.println("请您选择要操作的功能：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "add":
                    // 把商品加入到购物车中去。
                    addGoods(shopCart, sc);
                    break;
                case "query":
                    // 查看购物车中的商品信息
                    queryGoods(shopCart);
                    break;
                case "update":
                    updateGoods(shopCart, sc);
                    break;
                case "pay":
                    calcPayMoney(shopCart);
                    break;
                default:
                    System.out.println("当前命令输入有误！");
            }
        }
    }

    private static void calcPayMoney(Goods[] shopCart) {
        queryGoods(shopCart);
        double money = 0;
        for (int i = 0; i < shopCart.length; i++) {
            Goods g = shopCart[i];
            if (g != null) {
                money += (g.getPrice() * g.getBuyNumber());
            } else {
                break;
            }
        }
        System.out.println("本次商品购买的总价为：" + money);
    }

    private static void updateGoods(Goods[] shopCart, Scanner sc) {
        while (true) {
            System.out.println("请您输入要修改数量的商品编号：");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCart, id);
            if (g != null) {
                System.out.println("请您输入修改后购买" + g.getName() + "的数量：");
                int buyNumber = sc.nextInt();
                g.setBuyNumber(buyNumber);
                System.out.println(g.getName() + "的购买数量修改了！");
                queryGoods(shopCart);
                break;
            } else {
                System.out.println("购物车中没有该商品信息");
            }
        }
    }

    public static Goods getGoodsById(Goods[] shopCart, int id) {
        for (int i = 0; i < shopCart.length; i++) {
            Goods g = shopCart[i];
            if (g != null) {
                if (g.getId() == id) {
                    return g;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    private static void queryGoods(Goods[] shopCart) {
        System.out.println("商品编号\t商品名称\t商品价格\t商品的购买数量");
        for (int i = 0; i < shopCart.length; i++) {
            Goods g = shopCart[i];
            if (g != null) {
                System.out.println(g.getId() + "\t" + g.getName() + "\t" + g.getPrice() + "\t" + g.getBuyNumber());
            } else {
                return;
            }
        }
    }

    private static void addGoods(Goods[] shopCart, Scanner sc) {
        System.out.println("请输入商品的编号");
        int id = sc.nextInt();
        System.out.println("请您输入商品的名称：");
        String name = sc.next();
        System.out.println("请您输入商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请您输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        Goods g = new Goods();
        g.setId(id);
        g.setName(name);
        g.setPrice(price);
        g.setBuyNumber(buyNumber);
        for (int i = 0; i < shopCart.length; i++) {
            if (shopCart[i] == null) {
                shopCart[i] = g;
                break;
            }
        }
        System.out.println("商品" + g.getName() + "添加成功！");
    }
}
