package edu.xcdq;

public class Main {

    public static void main(String[] args) {
        int i = 1;  //循环的次数
        while (i <= 100) {
            System.out.println("这是我第" + i + "次激励：好好学习");
            i++;//循环次数+1，维持i的意义（循环的次数）正确，循环不变量，不变的是意义，数值发生变化为了使意义正确
        }
    }
}
