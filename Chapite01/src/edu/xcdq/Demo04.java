package edu.xcdq;

public class Demo04 {
    public static void main(String[] args) {
        // 自动类型转换
        int age = 18;
        float age1 = age;    //发生了类型的自动转换，由int类型自动转为了精准度更高的float型
        System.out.println(age1);

        double age2 = age1;
        System.out.println(age2);//发生了类型的自动转换，由float类型自动转为了精准度更高的double型
        //原则：按照精确度大小从小往大可以发生自动类型转换
        // byte -> short -> int -> float ->double


        //强制类型转换
        //原则：1、同类 2、double -> float -> int -> short -> byte   3、会造成精确度的丢失
        double price = 99.99;
        int countPrice = (int)price;//由double 类型转为int类型，精确度下降，需要强制转换
        byte num1 = (byte)99.99;
        System.out.println(countPrice);
    }
}
