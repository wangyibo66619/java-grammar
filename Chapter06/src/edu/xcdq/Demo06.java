package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/19 10:29
 */
public class Demo06 {
    public static void main(String[] args) {
        //1~10之间的整数相加，得到累加值大于20时，打印当前整数的值
        int i = 0;
        int sum = 0;
        for (i = 0;i <= 10;i++) {
            sum += i;
            if ( sum > 20 ) {
                break;
            }
            System.out.println("i=" + i + "\tsum=" + sum);
        }
        System.out.println("当前的值为：" + i);
    }
}
