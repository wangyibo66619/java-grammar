package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/19 11:01
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int count = 0;
        for ( int i = 0;i < 5;i++) {
            System.out.println("请输入" + (i+1) + "个学生的成绩：");
            score = scanner.nextInt();
            if ( score < 80 ) {
                continue;
            }
            count++;
        }
        System.out.println("80分以上的人数为：" + count );
    }
}
