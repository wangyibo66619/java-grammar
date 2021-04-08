package edu.xcdq.demo04;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/4/1 10:34
 */
public class TestScoreCalc {
    public static void main(String[] args) {
        ScoreCalc sc = new ScoreCalc();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的java成绩：");
        sc.java = input.nextInt();
        System.out.print("请输入你的C成绩：");
        sc.c = input.nextInt();
        System.out.print("请输入你的DB成绩：");
        sc.db = input.nextInt();

        sc.showTotalScore();
        sc.showAvg();
    }
}
