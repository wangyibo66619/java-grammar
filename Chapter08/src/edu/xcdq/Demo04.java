package edu.xcdq;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 10:00
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] score = new int[5];
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i+1) + "个元素：" );
            score[i] = scanner.nextInt();
        }

        System.out.println("排序前：");
        for (int i  = 0;i < score.length;i++) {

            System.out.print(score[i] + "\t");
        }
        Arrays.sort(score);//排序方法，对数组进行排序
        System.out.println();
        System.out.println("排序后：");
        for (int i  = 0;i < score.length;i++) {
            System.out.print(score[i] + "\t");
        }
    }
}
