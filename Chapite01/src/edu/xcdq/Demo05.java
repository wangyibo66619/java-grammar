package edu.xcdq;

public class Demo05 {
    public static void main(String[] args) {
        // 实现一个数字加密器，加密规则是：加密结果 = (整数*10=5)/2 + 3.14159,加密结果仍为一整数
        int data = 100;
        int result = (int)((data*10+5) /2 + 3.14159);// (int) (int + double)
        int result1 = (data*10+5) /2 + (int)3.14159; //int + (int)double
        System.out.println(result);
        System.out.println(result1);

        boolean flag = (3 + 40%6) > (9/2*3);
        System.out.println(flag);
    }
}
