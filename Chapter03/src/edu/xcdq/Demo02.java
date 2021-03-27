package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/16 17:30
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入是否是会员：是（y）/否（其他字符）");
        String isVip = scanner.next();
        System.out.println("请输入购买金额：");
        double money = scanner.nextDouble();
        if ("y".equals(isVip)) { //vip用户
            if (money >= 200) {
                System.out.println("实际支付：" + money*0.75);
            }else {
                System.out.println("实际支付：" + money*0.8);
            }
        }else { // 普通用户
            if (money >= 100) {
                System.out.println("实际支付：" + money*0.9);
            }else {
                System.out.println("实际支付：" + money);
            }

        }
        scanner.close();
    }
}
