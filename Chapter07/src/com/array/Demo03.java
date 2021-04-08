package com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/24 11:32
 */
public class Demo03 {
    //有一组学员的成绩{99，85，82，63， 60}，将它们按升序排列。要增加一个学员的成绩，将它插入成绩序列，并保持升序。
    public static void main(String[] args) {
        int [] score = new int[6];
        score[0] = 99;
        score[1] = 85;
        score[2] = 82;
        score[3] = 63;
        score[4] = 60;
        int num = score.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int input = scanner.nextInt();
        for ( int i = 0;i < score.length;i++ ) {
            if ( input > score[i] ) {
                num = i;
                break;
            }
        }
        for ( int j = score.length-1;j > num;j-- ) {
            score[j] = score[j-1];
        }
        score[num] = input;
        System.out.println("插入你输入的成绩后的结果为:");
        for ( int i = 0;i < score.length;i++ ) {
            System.out.println(score[i]);
        }
    }
}
