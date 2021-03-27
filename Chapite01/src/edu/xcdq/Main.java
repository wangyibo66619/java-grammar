package edu.xcdq;

public class Main {

    public static void main(String[] args) {
	    // 数据类型
        // 1、基本数据类型
        // 1.1 数值    整数
        int age = 18;  // 占用4个字节       1字节=8bit      -2^31 <--> 2^31-1
        short num1 = 17;// 占用2个字节      2字节=16bit     -2^15 <--> 2^15-1
        byte num2 = 16;// 占用1个字节       [+-][][][]  [][][][]  -2^7   <--> 2^7-1

        System.out.println(age);
        System.out.println(num1);
        System.out.println(num2);


        System.out.println(Integer.MAX_VALUE);// 2147483647     -2^31 <--> 2^31-1
        System.out.println(Integer.MIN_VALUE);// -2147483648

        System.out.println(Short.MAX_VALUE); // 32767           -2^15 <--> 2^15-1
        System.out.println(Short.MIN_VALUE); // -32768

        System.out.println(Byte.MAX_VALUE); // 127              -2^7 <--> 2^7-1
        System.out.println(Byte.MIN_VALUE); // -128
        // 1.2 小数
        float num3 = 18.88f;  //浮点类型    小数点是浮动的   占4个字节
        double num4 = 17.77;  //双精度      精确度更高      占8个字节
        System.out.println(Float.MIN_VALUE);    //1.4E-45
        System.out.println(Float.MAX_VALUE);    //3.4028235E38

        System.out.println(Double.MIN_VALUE);   //4.9E-324
        System.out.println(Double.MAX_VALUE);   //1.7976931348623157E308


        //2、引用数据类型
        String name = "卧槽你的";

        //3、特殊数据类型
        char sex = '男';  //字符类型，只能使用单引号，里面只能是一个字符
        boolean flag = true;//布尔类型，true  false
    }
}
