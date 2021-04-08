package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/22 13:00
 */
public class homework3 {
    public static void main(String[] args) {
        String User = "wang";
        String password = "123";
        Scanner scanner = new Scanner(System.in);
        String inputUser = "";
        String inputPassword;
        for ( int i = 2;i >= 0;i--) {
            System.out.print("请输入用户名：");
            inputUser = scanner.next();
            System.out.print("请输入密码：");
            inputPassword = scanner.next();
            if ( inputUser.equals("wang") && inputPassword.equals("123") ) {
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("用户名或密码输入错误，您还有" + i + "次机会");
            }
        }
    }
}
