package com.miniGame.www;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/23 9:02
 */
public class mini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎进入迷你游戏平台\n");
        System.out.println("请选择您喜欢的游戏：");
        System.out.println("*****************************");
        System.out.println("1、斗地主\n2、斗牛\n3、泡泡龙\n4、连连看");
        System.out.println("*****************************");
        System.out.println("请选择，输入数字：");
        int choose = scanner.nextInt();//选择要进行的游戏
        switch (choose) {
            case 1:
                System.out.println("您已进入斗地主房间！");
                break;
            case 2:
                System.out.println("您已进入斗牛房间！");
                break;
            case 3:
                System.out.println("您已进入泡泡龙房间！");
                break;
            case 4:
                System.out.println("您已进入连连看房间！");
        }

        System.out.println("迷你游戏平台 > 游戏晋级");
        int score = 0;  //创建输入成绩的输入框
        int over80 = 0; //计算八十分以上的次数
        int sum = 1;    //计算游戏的局数
        boolean flag = true;
        String yOrn = "";
        for (sum = 1;sum <= 5;sum++) {
            System.out.print("您正在玩第" + sum + "局，成绩为：");
            score = scanner.nextInt();
            if ( score > 80) {
                over80++;
            }
            if ( sum <= 4 ) {
                System.out.print("继续玩下一级吗？（y/n）");
                yOrn = scanner.next();
            }
            if ( "n".equals(yOrn) ) {  //建议把确定有值的字符串写前面，避免程序报错
                System.out.println("游戏结束");
                flag = false;
                break;
            }else if ("y".equals(yOrn)) {
                if ( sum <= 4 ) {
                    System.out.println("进入下一级");
                }
            }else {
                    System.out.println("请输入y/n !");
                    yOrn = scanner.next();
            }
        }
        // 判断是否晋级
        if ( flag ) {
            if ( sum < 5 ) {
                System.out.println("晋级失败");
            }else if ( over80 >= 4 ) {
                System.out.println("恭喜！通过一级");
            }else if ( over80 >= 3 ) {
                System.out.println("恭喜！通过二级");
            }else {
                System.out.println("晋级失败");
            }
        }


        //玩游戏并支付游戏币
        System.out.println("迷你游戏平台 > 游戏币支付\n");
        System.out.println("请选择您玩的游戏类型：\n 1、棋牌类\n 2、休闲竞技类");
        System.out.println("请选择：");
        String choice = scanner.next();
        double gameTime = 0;
        double money = 0;
        if ( "1".equals(choice) ) {
            System.out.println("请输入游戏时长：");
            gameTime = scanner.nextDouble();
            if ( gameTime >= 10 ) {
                money = gameTime * 10 * 0.8;
            }else if ( gameTime < 10 && gameTime > 0) {
                money = gameTime * 10 * 0.8;
            }else {
                System.out.println("输入时间有误");
            }
            System.out.println("您玩的是棋牌类游戏，时长是：" + gameTime + "小时，可以享受8折优惠\n您需支付" + money + "个游戏币");
        }else {
            if ( "2".equals(choice) ) {
                System.out.println("请输入游戏时长：");
                gameTime = scanner.nextDouble();
                if ( gameTime >= 10 ) {
                    money = gameTime * 20 * 0.5;
                }else if ( gameTime < 10 && gameTime > 0) {
                    money = gameTime * 20 * 0.8;
                }else {
                    System.out.println("输入时间有误");
                }
                System.out.println("您玩的是棋牌类游戏，时长是：" + gameTime + "小时，可以享受8折优惠\n您需支付" + money + "个游戏币");
            }
        }
        //添加用户信息
        String slNum = "";// 用户编号
        int age = 0;//用户年龄
        int integral = 0;//用户积分
        System.out.println("迷你游戏平台 > 添加用户信息");
        System.out.println("请输入要录入用户的数量:");
        int num = scanner.nextInt();
        for ( int i = num;i >= 1;i--) {
            System.out.print("请输入用户的编号（<4位整数>）：");
            slNum = scanner.next();
            if ( !( Integer.valueOf(slNum) >= 1000 && Integer.valueOf(slNum) < 9999 ) ) {
                System.out.println("用户编号输入有误");
            }
            System.out.println("请输入用户年龄：");
            age = scanner.nextInt();
            if ( age < 10 ) {
                System.out.println("很抱歉，您的年龄不适宜玩游戏");
                System.out.println("录入信息失败");
                num--;
                continue;

            }
            System.out.println("请输入会员积分：");
            integral = scanner.nextInt();
            System.out.println("您录入的会员信息为：");
            System.out.print( "用户编号：" + slNum + "\t\t年龄：" + age + "\t积分：" + integral + "\n");
        }


    }
}
