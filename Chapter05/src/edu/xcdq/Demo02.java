package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/3/18 14:58
 */
public class Demo02 {
    public static void main(String[] args) {
        int students = 250000;
        int year = 2012;
        while (students <= 1000000) {
            students = (int) (students * (1 + 0.25));
            year++;
            System.out.println("年份：" + year + "\t学生：" + students);
        }
        System.out.println(year + "年超过一百万");
    }
}
