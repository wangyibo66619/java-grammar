package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/25 15:07
 */
public class Demo04 {
    public static void main(String[] args) {
        // 九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}
