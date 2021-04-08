package demo;  // 包 包名
/*
 *  public  公有的，公共的    其他程序都可以访问，最大的权限，其他程序都能访问
 *  class   类
 *  Main    类的名称，随便取名字，最好有意义的，一般要求首字母大写
 *
*/

public class Main {
    /*
    * public  公有的，公共的     其他程序都可以访问，最大的权限，其他程序都能访问
    * static  静态的           没有对象也可以调用，属于公共资源
    * void    空              方法的返回值，由于main是主方法，不需要跟任何程序返回内容，因此就写空
    * main    主要的           方法的名字，可以随便取，但是入口主方法只能写成main，自定义的方法可以自己取，建议有意义，建议首字母小写，驼峰命名法
    * (String[] args)         方法的参数  String[] -> 参数的类型 args 数组的名字
    * */
    public static void main(String[] args) {
        // 对象的创建  类型 对象名 = new 类名()
        Student wangyibo = new Student();
        // 属性的赋值
        wangyibo.name = "王艺博";
        wangyibo.age = 18;
        wangyibo.sex = '男';
        wangyibo.high = 1.75;
        wangyibo.height = 63;
        // 属性的调用
        System.out.println(wangyibo.name);
        System.out.println(wangyibo.age);
        System.out.println(wangyibo.high);
        System.out.println(wangyibo.height);
        System.out.println(wangyibo.sex);
        // 方法的调用
        wangyibo.eat();
        wangyibo.play();
        wangyibo.sleep();
    }
}
