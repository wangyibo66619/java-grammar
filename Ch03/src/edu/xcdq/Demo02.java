package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/12 8:57
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入java成绩：");
        int javaScore = scanner.nextInt();
        System.out.println("请输入体育成绩：");
        int peScore = scanner.nextInt();

        if ((javaScore > 97 && peScore > 85) || (javaScore == 100 && peScore > 75)) {
            System.out.println("奖励一巴掌");
        } else {
            System.out.println("不奖励");
        }
        scanner.close();
    }
}
