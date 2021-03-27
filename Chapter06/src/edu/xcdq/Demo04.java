package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/19 10:02
 */
public class Demo04 {
    public static void main(String[] args) {
        //求1~100之间不能被3整除的数
        int sum = 0;
        for (int i = 0;i <= 100;i++){
            if (i % 3 != 0) {
                System.out.println("不能被三整除的数：" + i );
                sum += i;
            }
        }
        System.out.println( "以上数值的和为" + sum);
    }
}
