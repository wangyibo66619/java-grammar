package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 10:19
 */
public class Demo05 {
    //打擂台 求最大值
    public static void main(String[] args) {
        int [] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i+1) + "位学生的成绩：");
            scores[i] = scanner.nextInt();
        }
        // 打擂台
        int max = scores[0];  // 假设数组中第一个元素是最大值
        for (int i = 0; i < scores.length; i++) {
            if ( scores[i] > max ) {  //如果数组中有比当前最大值更大的数据，
                max = scores[i];    // 那么直接替换掉当前的最大值（更新最大值）
            }
        }
        System.out.println("最大值：" + max );
    }
}
