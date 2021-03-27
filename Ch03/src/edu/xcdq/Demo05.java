package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/12 10:31
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入存款");
        int money = scanner.nextInt();
       /** if (money >= 10 && money < 20 ) {
            System.out.println("自行车");
        }else if (money >= 20 && money < 30) {
            System.out.println("电动车");
        }else if (money >= 30 && money < 40) {
            System.out.println("小汽车");
        }else if (money >= 40 && money < 50) {
            System.out.println("卡车");
        }else if (money >= 50 && money < 60) {
            System.out.println("装甲车");
        }else{
            System.out.println("继续努力");
        }
        */
       switch (money /10){
           case 1:
               System.out.println("自行车");
               break;
           case 2:
               System.out.println("电动车");
               break;
           case 3:
               System.out.println("小汽车");
               break;
           case 4:
               System.out.println("卡车");
               break;
           case 5:
               System.out.println("装甲车");
               break;
       }
       scanner.close();
    }
}
