package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/18 15:55
 */
public class Demo04 {
    public static void main(String[] args) {
        double sheshi = 0;
        double huashi = 0;
        int tiaomu = 0;
        System.out.println("摄氏度" + "\t\t\t华氏度");
        do {
            tiaomu++;
            huashi = sheshi * 9/5.0+32;
            System.out.println( sheshi + "\t\t\t" + huashi );
            sheshi += 20;      //sheshi = sheshi + 20;
        }while (tiaomu < 10 && sheshi <= 250) ;
    }
}
