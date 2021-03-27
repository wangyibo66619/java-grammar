package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/19 10:18
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int sum = 0;
        boolean flag = true;
        for ( int i = 0;i < 5;i++ ) {
            System.out.println("请输入第" + (i+1) + "门课的成绩");
            score = scanner.nextInt();
            if ( score < 0 ) {
                System.out.println("输入的数据有误，程序已经罢工了");
                flag = false;
                break;
            }
            sum += score;
        }
        if ( flag ) {
            System.out.println("平均成绩：" + sum / 5);
        }

    }
}
