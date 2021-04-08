package edu.xcdq;

public class Main {

    public static void main(String[] args) {
        /**
         *
         *数组的声明与初始化 定义
         */
        int [] scores;  //声明：告诉操作系统有一个数组的变量 叫scores
        int [] scores1 = new int[5];//声明并初始化 申请了内存空间,申请空间成功，则在内存中初始化为0
        for ( int i = 0;i < scores1.length;i++ ) {
            System.out.println(scores1[i] + "\t");
        }
        //定义:给定元素的值
        scores1[0] = 45;
        scores1[1] = 55;
        scores1[2] = 65;
        scores1[3] = 75;
        scores1[4] = 85;

        /**
         * 数组的3种使用方式
         */
        // 1 声明初始化赋值
        int [] array1 = new int[3];
        for (int i = 0;i < array1.length;i++) {
            array1[i] = i;
        }
        // 2
        int [] array2 = new int[] {0,1,2};// 初始化的值直接给定 0 1 2

        // 3
        int [] array3 = {0,1,2};  // 创建的时候直接给定值 0 1 2


    }
}
