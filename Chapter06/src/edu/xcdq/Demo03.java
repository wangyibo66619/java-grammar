package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/19 9:29
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = 0;
        System.out.println("请输入一个值：");
        val = scanner.nextInt();
        System.out.println("根据这个值可以输入以下加法表：");
        for (int i = 0,j = val;i <= val;i++,j--) {
            System.out.println(i + "+" + j + "=" + (i+j) );
        }
    }
}
