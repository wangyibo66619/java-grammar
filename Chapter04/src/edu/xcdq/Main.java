package edu.xcdq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入快捷键：");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("爸爸");
                break;
            case 2:
                System.out.println("妈妈");
                break;
            case 3:
                System.out.println("爷爷");
                break;
            case 4:
                System.out.println("奶奶");
                break;
            default:
                System.out.println("尚未设置此数字的自动拨号");
        }
        scanner.close();
    }
}
