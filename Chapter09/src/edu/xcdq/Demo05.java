package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 15:27
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("欢迎进入第" + ( i + 1 ) + "家专卖店");
            for (int j = 0; j < 3; j++) {
                System.out.println("要离开吗(y/n):");
                String shifou = scanner.next();
                if ("n".equals(shifou)) {
                    System.out.println("买了一件衣服");
                }else if ("y".equals(shifou)) {
                    System.out.println("离店结账");
                    break;
                }
            }
        }
    }
}
