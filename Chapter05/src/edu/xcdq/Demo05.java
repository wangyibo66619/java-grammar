package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/19 8:17
 */
public class Demo05 {
    public static void main(String[] args) {
        // 计算一百以内偶数的和
        int num = 2;
        int sum = 0;
        while ( num <= 100 ) {
            sum = sum + num;
            System.out.println("num:" + num + "\tsum:" + sum );
            num += 2;
        }
    }
}
