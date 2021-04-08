package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/25 14:47
 */
public class Demo01 {
    public static void main(String[] args) {
        // 鸡兔同笼
        /**
         *  一共有14个头  脚 46
         *鸡 i
         * 兔子 j
         */
        for (int i = 0; i <= 14; i++) {
            for (int j = 14-i; j <= 14-i; j++) {
                if ( 2*i + 4*j == 46 ) {
                    System.out.println("鸡有：" + i + "兔子有：" + j);
                    break;
                }
            }
        }

    }
}
