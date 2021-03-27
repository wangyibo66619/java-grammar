package edu.xcdq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ctrl + alt + l   自动调整代码样式
        // 选择结构
        Scanner scanner = new Scanner(System.in); // 定义一个系统输入扫描器，用于监听键盘的输入
        System.out.println("请输入你的成绩：");
        int score = scanner.nextInt();//扫描器在键盘中接受一个输入的整数
        if (score > 97) {
            System.out.println("奖励一个手机");
        }
        if (score <= 97) {
            System.out.println("没有奖励");
        }
        scanner.close();
    }
}
