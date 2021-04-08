package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/22 8:00
 */
public class homework1 {
    public static void main(String[] args) {
        //商场对顾客的年龄层次进行调查
        //计算各年龄层次的顾客比例

        Scanner scanner = new Scanner(System.in);
        int age;
        int over30 = 0;//三十岁以上
        int under30 = 0;//三十岁以下
        for (int i = 0;i < 10;i++) {
            System.out.println("请输入第" + i + "位顾客的年龄：");
            age = scanner.nextInt();
            if ( age >= 30 ) {
                over30 ++;
            }else {
                if (age <= 30) {
                    under30 ++;
                }
            }
        }
        System.out.println("三十岁以上的比例是：" + over30 * 10 + "%");
        System.out.println("三十岁以下的比例是：" + under30 * 10 + "%");
    }
}
