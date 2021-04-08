package edu.xcdq.demo01;

public class Main {
    /*
        方法（返回值 方法名 参数 方法体）
        （操作 函数 行为 动作）
            1、根据返回值的分类
                1.1 有返回值  int String double boolean......
                1.2 没有返回值
            2、 根据参数分类
                2.1 有参数
                    有一个参数
                    有多个参数
                2.2 没有参数

            交叉组合
            1 没有返回值且没有参数
            2 没有返回值但有参数
            3 有返回值但没有参数
            4 有返回值且有参数
     */
    //   1 没有返回值且没有参数
    public void jiao() {
        System.out.println("汪汪汪");
    }
    //   2 没有返回值但有参数
    public void setAge(int age){
        int myAge = age;
        System.out.println( "myAge:" + myAge );
    }
    public void setInfo(String name,int age,char sex){
        String myName = name;
        int myAge = age;
        char mySex = sex;
        System.out.println("myName:" + myName + "\tmyAge:" + myAge + "\tmySex:" + mySex);
    }
    //   3 有返回值但没有参数
    public  int getAge(){
        return 18;
    }
    public String getName(){
        String name = "小王";
        return name;
        // return 18;   return 18 ,name;   语法错误  一个方法只能有一个严格意义上的返回值
    }
    //   4 有返回值且有参数
    public String play(String name1,String name2,int count){
        System.out.println(name1 + "和" + name2 + "一共" + count + "个人一起玩耍");
        return "cool";
    }
    //  静态方法  (不需要对象也能访问)
    public static void test01(){
        System.out.println("测试方法01");
        // test02() 出错，调用普通方法有对象才可以访问
    }
    // 同一个类中的普通方法访问  直接写要调用的方法名  有对象才可以访问
    public void test02(){
        getAge();// 同一个类中的普通方法访问  直接写要调用的方法名
        test01();// 直接访问静态的test01()方法
        /*
            静态方法  (不需要对象也能访问)    普通方法有对象才可以访问
            可以用过静态方法访问普通方法，但是没有办法直接通过普通方法访问静态方法
         */
    }
}
