package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/12 10:44
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("输入比赛成绩：");
        Scanner scanner = new Scanner(System.in);
        double miao = scanner.nextDouble();
        if (miao <= 10 ) {
            System.out.println("请输入性别：");
            String sex = scanner.next();
            if ("男".equals(sex)) {
                System.out.println("进入男子组");
            }else if ("女".equals(sex)){
                System.out.println("进入女子组");
            }else{
                System.out.println("卧槽 你的");
            }
        }else{
            System.out.println("无法进入决赛");
        }
        scanner.close();
    }
}
