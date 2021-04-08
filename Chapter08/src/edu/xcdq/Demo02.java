package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/25 9:15
 */
public class Demo02 {
    public static void main(String[] args) {
        int [] score = new int[2];
        score[2] = 11;      //ArrayIndexOutOfBoundsException  数组索引超出范围异常（越界异常）
        System.out.println(score[2]);
    }
}
