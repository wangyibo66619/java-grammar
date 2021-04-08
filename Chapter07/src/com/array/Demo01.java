package com.array;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/24 10:42
 */
public class Demo01 {
    public static void main(String[] args) {
        // 从键盘上任意输入一个数字，判断数组中是否包含此数
        int[] score = new int[] {12,32,43,56,76,87,98};
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();;
        for (int i = 0;i < score.length;i++) {
            if ( input == score[i] ) {
                System.out.println(input + "是数组score中的数");
                break;
            }else {
                System.out.println(input + "不是数组score中的数");
                break;
            }
        }
    }
}
