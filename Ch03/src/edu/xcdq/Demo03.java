package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/12 9:30
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("这次你中了多少钱？");
        int num = scanner.nextInt();
        if (num >=500){
            System.out.println("去欧洲旅游");
        }else{
            System.out.println("烧高香");
        }
        scanner.close();
    }
}
