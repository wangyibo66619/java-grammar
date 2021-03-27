package edu.xcdq;

public class Demo03 {
    public static void main(String[] args) {
        //1、根据天数(46)计算周数和剩余的天数
        int days = 46;
        int week = days /7;
        int leftDay = days %7;
        System.out.println("46天等于" + week +"周"+ "剩余" + leftDay + "天");

        //2、已知圆的半径radius=1.5，求其面积
        double r = 1.5;//圆半径
        double pai = 3.14159;//圆周率
        double area = pai * r * r;//计算圆面积
        System.out.println("圆的面积为：" + area);
    }
}
