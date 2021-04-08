package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/25 14:56
 */
public class Demo02 {
    public static void main(String[] args) {
        int row = 4;
        int cols = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
