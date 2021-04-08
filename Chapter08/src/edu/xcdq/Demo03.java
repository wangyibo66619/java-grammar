package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/25 9:19
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array1 = {8,4,2,1,23,344,12};
        System.out.println("请输入你要猜的数据：");
        int num = scanner.nextInt();
        boolean flag = true;
        for ( int i = 0;i < array1.length;i++ ) {
            if ( num == array1[i] ) {
                flag = false;
                System.out.println("你输入的数据是：" + num + "\t恭喜你！数组中包含此数");
                break;
            }
        }
        if ( flag ) {
            System.out.println("很遗憾，没猜中");
        }
    }
}
