package com.scorpio.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用变量。
        //作用：存储一个数据，可以改变里面的数据。
        // 数据类型 变量名称 = 初始值;
        double money = 6.0;
        System.out.println(money);

        // 收红包(从=右往左看)
        money = money + 4.0;
        System.out.println(money);

        System.out.println("----------------------------");

        int age = 21;
        System.out.println(age);

        age = 25;
        System.out.println(age);
    }
}
