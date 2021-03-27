package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/19 8:28
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println( "商店管理系统 > 购物结算" );
        System.out.println("***********************************");
        System.out.println("请选择购买商品的编号：");
        System.out.println("1、T恤\t2、网球鞋\t3、网球拍");
        System.out.println("***********************************");
        Scanner scanner = new Scanner(System.in);
        String shifoujixu = "";
        int bianhao = 0;
        do {
            System.out.println("请输入商品编号：");
            bianhao = scanner.nextInt();
            switch (bianhao) {
                case 1:
                    System.out.println("T恤 \t\t\t ￥245.0");
                    break;
                case 2:
                    System.out.println("网球鞋 \t\t\t ￥60.0");
                    break;
                case 3:
                    System.out.println("网球拍 \t\t\t ￥30.0");
                    break;
            }
            System.out.println("是否继续（y/n）");
            shifoujixu = scanner.next();
        }while ("y".equals(shifoujixu)) ;
    }
}
