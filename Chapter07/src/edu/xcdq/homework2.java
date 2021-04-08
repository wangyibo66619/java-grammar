package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/22 8:26
 */
public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Vip = "";
        int month = 0;
        int day = 0;
        int jifen = 0;
        for (int i = 0;i < 3;i++) {
            System.out.println("MyShopping管理系统 > 客户信息管理 > 添加客户信息");
            System.out.print("请输入会员号（<4位整数>）：");
            Vip = scanner.next();
            System.out.print("请输入会员生日（月/日<用两位整数表示：>）");
            month = scanner.nextInt();
            System.out.print("/");
            day = scanner.nextInt();
            if ( ( Integer.valueOf(Vip) > 1000 && Integer.valueOf(Vip) <9999 ) && ( (month < 13 && month > 0) && (day <= 30 && day >= 1) ) ) {
                System.out.println("请输入会员积分：");
                jifen = scanner.nextInt();
                System.out.println("您录入的会员信息是：" + "\n" + Vip + "\t" + month + "/" + day + "\t" + jifen);
            }else {
                System.out.println("会员号或生日输入错误");
                continue;
            }

        }
    }
}
