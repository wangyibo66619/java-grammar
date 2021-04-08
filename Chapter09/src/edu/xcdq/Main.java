package edu.xcdq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 求3个班的 每个班的平均成绩

        // 1 求一个班的平均成绩

        Scanner scanner = new Scanner(System.in);


        // 2 求3个班的平均成绩
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                System.out.println("请输入第" + (i+1) + "个学生的成绩：");
                int score = scanner.nextInt();
                sum += score;
            }
            int avg = sum /4 ;
            System.out.println("第" + (j+1) + "班的平均成绩为：" + avg);
        }
    }
}
