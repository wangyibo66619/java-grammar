package edu.xcdq.demo03;

/**
 * @author 王艺博
 * @date 2021/4/1 10:09
 */
public class test01 {
    /*
        变量的作用范围
            全局变量（静态变量）
            成员变量
            局部变量
     */
    // 全局变量(静态变量) 有默认值 0 ，可以跨文件访问，不需要对象可以直接访问
    static int a;

    //成员变量 有默认值，有对象才可以访问
    String name;  // 系统给定的默认值 null
    int age;      // 0

    public void play() {
        // 局部变量，作用范围局限在方法中，且没有默认值
        int money = 99;
    }

}
