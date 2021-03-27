package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/18 11:22
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("学习是否合格？（y/n）");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        while ("n".equals(answer)) {
            System.out.println("上午学理论！");
            System.out.println("下午学编程！");
            System.out.println("学习是否合格？（y/n）");
            answer = scanner.next();
        }
        System.out.println("完成学习任务！");
        scanner.close();
    }
}
