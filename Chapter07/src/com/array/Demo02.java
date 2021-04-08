package com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/24 11:22
 */
public class Demo02 {
    //循环录入五位学员的成绩，进行升序排列后输出结果
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputScore = 0;
        int [] score = new int[5];
        for ( int i = 0;i < score.length;i++) {
            System.out.println("请输入你的成绩：");
            inputScore = scanner.nextInt();
            score[i] = inputScore;
        }
        Arrays.sort(score);
        System.out.println("五位学员成绩按升序排序后为：");
        for ( int j = 0;j < score.length;j++ ) {
            System.out.println(score[j]);
        }
    }
}
