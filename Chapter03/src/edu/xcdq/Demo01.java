package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/16 16:45
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("超市管理系统 > 客户信息管理 > 添加客户信息");
        System.out.print("请输入会员号(<4位整数>)：");
        String num = scanner.next();
        if ( (Integer.valueOf(num) < 9999 && Integer.valueOf(num) > 1000)) {

            System.out.print("请输入会员生日(月/日<用两位表示>)：");
            String birthday = scanner.next();
            System.out.print("请输入积分：");
            int jifen = scanner.nextInt();
            System.out.println();
            System.out.print("已录入的会员信息是：" + "\n" + num + "\t\t" + birthday + "\t\t" + jifen);

        }else {
            System.out.println("请输入4位整数");
        }
        scanner.close();
    }
}
