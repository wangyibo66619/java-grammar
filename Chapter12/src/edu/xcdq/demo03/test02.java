package edu.xcdq.demo03;

import java.util.Arrays;

/**
 * @author 王艺博
 * @date 2021/4/1 10:13
 */
public class test02 {
    public static void main(String[] args) {
        test01 t1 =  new test01();
        // t1.name = "小明";
        System.out.println(t1.name);
        System.out.println(t1.age);

        // 局部变量
        double d1;// 普通的变量没有默认值
       //System.out.println(d1); // 可能尚未初始化变量d1
        int [] d2 = new int[3];// [0, 0, 0] 数组有默认值
        System.out.println(Arrays.toString(d2));

        // 全局变量
        System.out.println(test01.a);
    }
}
