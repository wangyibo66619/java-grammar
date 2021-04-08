package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/25 15:04
 */
public class Demo03 {
    public static void main(String[] args) {
        int row = 5;
        int cols = 6;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
