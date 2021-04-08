package edu.xcdq.demo01;

/**
 * @author 王艺博
 * @date 2021/3/30 17:43
 */
public class demo01 {
    public static void main(String[] args) {
        Guanliyuan guanliyuan= new Guanliyuan();
        guanliyuan.name = "混子";
        guanliyuan.age = 18;
        guanliyuan.high = 1.56;
        guanliyuan.height = 80;

        System.out.println(guanliyuan.name);
        System.out.println(guanliyuan.age);
        System.out.println(guanliyuan.high);
        System.out.println(guanliyuan.height);

        guanliyuan.eat();
        guanliyuan.play();
        guanliyuan.sleep();
    }
}
