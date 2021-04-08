package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 15:40
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入直角三角形的行数");
        int hangshu = scanner.nextInt();
        for (int i = 0; i < hangshu; i++) {
            for (int j = hangshu; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
