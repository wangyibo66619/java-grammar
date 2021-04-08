package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/26 8:16
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        for (int i = 0; i < 3; i++) {
            int num = 0;
            System.out.println("请输入第" + (i+1) + "个人所购的三件商品的价格：");
            for (int j = 0; j < 3; j++) {
                    price = scanner.nextDouble();
                    if ( price >= 300 ) {
                        num++;
                    }
            }
            System.out.println("第" + (i+1) + "个人共有" + num + "间商品享受8折优惠");
        }
    }
}
