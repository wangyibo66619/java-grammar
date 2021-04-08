package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 8:56
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int [] scores = new int[5];
        for (int i = 0;i < scores.length;i++) {
            System.out.println("请输入第" + (i+1) + "个学生的成绩");
            scores[i] = scanner.nextInt();// 把接收到的成绩储存到数组中对应的位置
            sum += scores[i];  // 累加求和
        }
        System.out.println("平均分：" + sum/ scores.length);
    }
}
