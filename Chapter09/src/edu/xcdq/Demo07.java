package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 15:45
 */
public class Demo07 {
    public static void main(String[] args) {
        //等腰三角形
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要打印的行数：");
        int hangshu = scanner.nextInt();
        for (int i = 1; i <= hangshu; i++) {  // 控制行数
            for (int j = hangshu-1; j >= i ; j--) { //  一行中“ ”的个数
                System.out.print(" ");
                }
            for (int k = 0; k < i*2-1; k++) {//  一行中“*” 的个数
                System.out.print("*");
            }
            System.out.println();  // 一行完成打印，换行
            }

        }
    }