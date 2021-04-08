package edu.xcdq.demo01;

/**
 * @author 王艺博
 * @date 2021/4/1 8:39
 */
public class test {
    public static void main(String[] args) {
        // 对象的创建  类名 对象名 = new 类名();
        Main demo01 = new Main();

        demo01.jiao();

        demo01.setAge(18);
        demo01.setInfo("小明同学",18,'男');

        int res = demo01.getAge();
        System.out.println(res);

        System.out.println(demo01.getName());

        String result = demo01.play("小王","小张",2);
        System.out.println(result);

        // 方法的访问
        Main.test01();//静态方法  类名. 方法()
        demo01.test02();// 普通方法  对象.方法()
    }
}
