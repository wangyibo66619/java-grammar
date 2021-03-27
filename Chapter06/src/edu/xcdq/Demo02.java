package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/19 9:16
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int sum = 0;
        for (int i = 1;i <= 5;i++) {
            System.out.println("请输入第" + i + "门课的成绩");
            score = scanner.nextInt();
            sum += score;
        }
        System.out.println("平均成绩：" + sum / 5);
    }
}
