package edu.xcdq;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 10:29
 */
public class Demo06 {
    public static void main(String[] args) {
        /**
         * 插入新元素，依旧保持原数组有序
         */
        int [] scores = new int[7];
        scores[0] = 99;
        scores[1] = 88;
        scores[2] = 77;
        scores[3] = 66;
        scores[4] = 55;
        scores[5] = 44;
        // 1、获取要插入的值
        System.out.println("请输入你要插入的值：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // 2、找到要插入新值的位置
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if ( num > scores[i] ) {
                index = i;
                break;
            }
        }
        // 2.1 打印原数组
        System.out.println(Arrays.toString(scores));
        // 3.把元素向后移动  index <-> length-1
        for (int i = scores.length-1; i > index; i--) {
            System.out.println("把" + (i-1) + "位置的元素" + scores[i-1] + "移动到" + i + "位置" + scores[i]);
            scores[i] = scores[i-1];
            System.out.println(Arrays.toString(scores));
        }
        // 4、插入新值
        System.out.println("在" + index + "位置" + scores[index] + "插入新值：" + num);
            scores[index] = num;
        // 5、打印插入后的结果
        System.out.println("降序");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        System.out.println();
        System.out.println("升序");
        for (int i = scores.length-1; i >= 0; i--) {
            System.out.print(scores[i] + "\t");
        }

    }
}
