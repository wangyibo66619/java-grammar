package edu.xcdq;

public class Main {

    public static void main(String[] args) {
	// 计算100以内的奇数之和，并设置断点调试程序，追踪3个表达式的执行顺序及循环变量的变化
        int sum = 0;
        for (int i = 0;i <= 100;i++) {
            if ( i % 2 == 1) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("一百以内奇数的和为：" + sum);


    }
}
