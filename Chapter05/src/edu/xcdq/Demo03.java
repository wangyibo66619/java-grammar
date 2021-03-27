package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/18 15:36
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shifouhege = "";
        do {
            System.out.println("上机编写程序");
            System.out.println("是否合格：（y/n）");
            shifouhege = scanner.next();
        }while (shifouhege.equals("n")) ;
        System.out.println("恭喜你合格了");
    }
}
