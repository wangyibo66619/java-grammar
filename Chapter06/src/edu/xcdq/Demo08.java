package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/19 11:09
 */
public class Demo08 {
    public static void main(String[] args) {
        //求1~10之间所有的偶数和
        int sum = 0;
        //方法1
        /*for (int i = 1;i <= 10;i++){
            if ( i % 2 == 0) {  // 能被二整除
                sum += i;
            }
        }
        System.out.println(sum);*/

        //方法二
        /*for (int i = 2;i <= 10;i+=2){   //步长为2  i = i+2
            sum += i;
        }
        System.out.println(sum);*/

        //方法三
        for ( int i = 1;i <= 10;i++) {
            if ( i % 2 !=0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
