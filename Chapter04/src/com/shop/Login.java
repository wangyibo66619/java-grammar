package com.shop;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/18 11:16
 */
public class Login {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("\t\t1、登陆系统" + "\n" + "\t\t2、退出");
        System.out.println("***********************************");
        //用户输入功能编号
        Scanner scanner = new Scanner(System.in);
        if ( scanner.hasNextInt() ) {
            int bianhao1 = scanner.nextInt();
            if ( bianhao1 == 1 ) {
                System.out.println("二级菜单");
                System.out.println("1 客户信息管理");
                System.out.println("2 购物结算");
                System.out.println("3 真情回馈");
                System.out.println("4 注销");
                //进入二级菜单
                System.out.println("输入功能编号：");
                int bianhao2 = scanner.nextInt();
                switch (bianhao2) {
                    case 1:
                        System.out.println("购物管理系统>显示客户所有信息");
                        System.out.println("1、显示所有客户信息");
                        System.out.println("2、添加所有客户信息");
                        System.out.println("3、修改客户信息");
                        System.out.println("4、查询客户信息");
                        // ......具体客户信息管理操作
                        break;
                    case 2:
                        System.out.println("购物结算");
                        System.out.print("请输入消费金额：");
                        // 用户输入  sumMoney
                        double sumMoney = scanner.nextDouble();
                        double realMoney = sumMoney;
                        //显示换购信息
                        System.out.println("是否参加优惠换购活动");
                        System.out.println("1:满50元，加2元换购百事可乐饮料1瓶");
                        System.out.println("2:满100元，加3元换购500ml可乐1瓶");
                        System.out.println("3:满100元，加10元换购5公斤面粉");
                        System.out.println("4:满200元，加10元可换购1个苏泊尔炒菜锅");
                        System.out.println("5:满200元，加20元可换购欧莱雅爽肤水一瓶");
                        System.out.println("0:不换购");
                        //用户输入功能编号
                        System.out.print("请选择：");
                        int num = scanner.nextInt();
                        switch (num) {
                            case 1:
                                if ( sumMoney >= 50 ) {
                                    realMoney = sumMoney + 2;
                                    //System.out.println("本次消费总金额：" + (sumMoney + 2) + "元");
                                    System.out.println("成功换购：1瓶百事可乐" );
                                    System.out.println("本次消费总金额：" + realMoney + "元");
                                }else {
                                    System.out.println("你购买的金额不足以参加活动");
                                }
                                break;
                            case 2:
                                if ( sumMoney >= 100) {
                                    realMoney = sumMoney + 3;
                                    //System.out.println("本次消费总金额：" + (sumMoney + 3) + "元");
                                    System.out.println("成功换购：500ml可乐一瓶" );
                                    System.out.println("本次消费总金额：" + realMoney + "元");
                                }else {
                                    System.out.println("你购买的金额不足以参加活动");
                                }
                                break;
                            case 3:
                                if (sumMoney >= 100) {
                                    realMoney = sumMoney + 10;
                                    //System.out.println("本次消费总金额：" + (sumMoney + 10) + "元");
                                    System.out.println("成功换购：5公斤面粉" );
                                    System.out.println("本次消费总金额：" + realMoney + "元");
                                }else {
                                    System.out.println("你购买的金额不足以参加活动");
                                }
                                break;
                            case 4:
                                if (sumMoney >= 200) {
                                    realMoney = sumMoney + 10;
                                    //System.out.println("本次消费总金额：" + (sumMoney + 10) + "元");
                                    System.out.println("成功换购：苏泊尔炒菜锅" );
                                    System.out.println("本次消费总金额：" + realMoney + "元");
                                }else {
                                    System.out.println("你购买的金额不足以参加活动");
                                }
                                break;
                            case 5:
                                if (sumMoney >= 200) {
                                    realMoney = sumMoney + 20;
                                    //System.out.println("本次消费总金额：" + (sumMoney + 20) + "元");
                                    System.out.println("成功换购：欧莱雅爽肤水一瓶" );
                                    System.out.println("本次消费总金额：" + realMoney+ "元");
                                }else {
                                    System.out.println("你购买的金额不足以参加活动");
                                }
                                break;
                            case 0:
                                System.out.println("本次消费总金额：" + realMoney);
                                System.out.println("没有参加换购活动");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("真购物管理系统>真情回馈");
                        System.out.println("1、幸运大放送");
                        System.out.println("2、幸运抽奖");
                        System.out.println("3、生日问候");
                        break;
                    case 4:
                        System.out.println("注销");
                        break;
                }

            }else if ( bianhao1 == 2 ) {
                System.out.println("你已退出系统");
            }
        }
        scanner.close();
    }
}
