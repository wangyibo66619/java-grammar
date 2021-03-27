package edu.xcdq;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //定义一个键盘扫描器
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入计算机基础的成绩");//commonScore:计算机基础的成绩
        int commonScore = scanner.nextInt();//从键盘接收输入的成绩
        System.out.println("计算机基础的成绩为："+ commonScore);

        System.out.println("请输入Java的成绩");//  javaScore：java的成绩
        int javaScore = scanner.nextInt();//从键盘接收输入的成绩
        System.out.println("Java的成绩为："+ javaScore);

        System.out.println("请输入Mysql的成绩");// mysqlScore:mysql的成绩
        int mysqlScore = scanner.nextInt();//从键盘接收输入的成绩
        System.out.println("Mysql的成绩为："+ mysqlScore);

        //求成绩差
        int cha ;
        cha = commonScore - javaScore;
        System.out.println("计算机基础与java之间的成绩差为：" + cha);

        //求平均数
        double avg = (commonScore + javaScore + mysqlScore)/3.0;
        System.out.println("平均成绩为：" + avg );
        scanner.close();
    }
}
