package edu.xcdq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  1、产生随机数   [0,1) * 10 = [0,10)
        System.out.println(Math.random());
        int luckyNum = (int)(Math.random() * 10);
        System.out.println(luckyNum);
    //  2、接收用户输入的会员号，并提取百位数字
        System.out.println("超市购物管理系统 > 幸运抽奖");
        System.out.println("请输入4位会员号：");
        Scanner scanner = new Scanner(System.in);
        int vipNo = scanner.nextInt();
        // 2.1  提取百位数字   4698  /100 = 46 % 10 = 6
        int baiwei = vipNo/100%10;

    //  3、比较是否相等，相等则赠送礼物
        if (baiwei == luckyNum) {
            System.out.println(vipNo + "是幸运客户，获赠洗衣液一瓶");
        }else {
            System.out.println(vipNo + "谢谢您的支持");
        }
        scanner.close();
    }
}
