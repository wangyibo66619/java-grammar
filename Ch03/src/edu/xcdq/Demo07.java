package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/12 11:17
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        double score = scanner.nextDouble();
        if (score == 100 ) {
            System.out.println("爸爸给你买辆车");
        }else if (score >= 90 && score < 100) {
            System.out.println("爸爸给你买mp4");
        }else if (score >= 60 && score < 90) {
            System.out.println("爸爸给你买参考书");
        }else if (score < 60 && score > 0) {
            System.out.println("爸爸给你一巴掌");
        }else{
            System.out.println("成绩不合法");
        }
        scanner.close();
    }
}
