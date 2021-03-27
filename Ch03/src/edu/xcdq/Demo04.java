package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/12 10:08
 */
public class Demo04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        int score = scanner.nextInt();
       /** if (score >= 80 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 70 && score < 80) {
            System.out.println("B");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格了");
        } else if (score < 60 && score >= 0) {
            System.out.println("不及格");
        } else {
            System.out.println("成绩不合法");
        }
        */

        switch (score /10) {
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            default:
                System.out.println("挂了");
        }
        scanner.close();
    }
}
