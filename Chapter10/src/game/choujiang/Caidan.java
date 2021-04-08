package game.choujiang;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/3/26 9:09
 */
public class Caidan {
    public static void main(String[] args) {
        String User = "";
        String[] UserKu = new String[1000];
        String password = "";
        String[] passwordKu = new String[1000];
        int kuNum = 0;
        int max = 9999;
        int min = 1000;
        int luckyNum = (int) ((Math.random() * (max - min)) + min);//幸运数字
        dede:
        while (true) {

            System.out.println("*****欢迎进入抽奖系统*****");
            System.out.println("\t\t1.注册\n\t\t2.登录\n\t\t3.抽奖");
            System.out.println("***********************");
            System.out.print("请选择菜单：");
            Scanner scanner = new Scanner(System.in);
            int functionNo = scanner.nextInt();
            switch (functionNo) {
                case 1:
                    System.out.println("[奖客富翁系统 > 注册]");
                    System.out.println("请填写个人注册信息：");
                    System.out.print("用户名：");
                    User = scanner.next();
                    System.out.print("密码：");
                    password = scanner.next();
                    System.out.println("会员卡号：");

                    int cardNumber = (int) ((Math.random() * (max - min)) + min);
                    System.out.println(cardNumber);
                    for (kuNum = 0; kuNum < UserKu.length; kuNum++) {
                        if (UserKu[kuNum] == null && passwordKu[kuNum] == null) {
                            UserKu[kuNum] =  User;
                            passwordKu[kuNum] =  password;
                            System.out.println("注册成功，请记好您的会员卡号");
                            System.out.println("用户名\t\t密码\t\t会员卡号");
                            System.out.println(UserKu[kuNum] + "\t\t" + passwordKu[kuNum] + "\t\t" + cardNumber);
                            break;
                        }

                    }

                    break;
                case 2:
                    haha:
                    for (int i = 3; i >= 1; i--) {
                        System.out.println("[奖客富翁系统 > 登录]");
                        System.out.print("请输入用户名：");
                        String outUser = scanner.next();
                        System.out.print("请输入密码：");
                        String outPassword = scanner.next();
                        /*if ( User.equals(outUser) && password.equals(outPassword)) {
                            System.out.println("欢迎您：" + User);
                            break;
                        }else if (i == 1) {
                            System.out.println("用户被冻结");
                        }else {
                            System.out.println("用户名或密码输入错误，还剩余" + (i-1) + "次机会");
                        }*/
                        if (true) {
                            for (int j = 0; j < UserKu.length; j++) {
                                if (outUser.equals(UserKu[j]) && outPassword.equals(passwordKu[j])) {
                                    System.out.println("欢迎您：" + UserKu[j]);
                                    break;
                                }
                            }
                            break;
                        } else {
                            if (i == 1) {
                                System.out.println("用户被冻结");
                            } else {
                                System.out.println("用户名或密码输入错误，还剩余" + (i - 1) + "次机会");
                            }
                        }

                    }
                    break;
                case 3:
                    System.out.println("[奖客富翁系统 > 抽奖]");
                    System.out.print("请输入您的卡号：");
                    String outCardNumber = scanner.next();
                    System.out.print("本日的幸运数字为：");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(luckyNum);
                    }
                    if (Integer.valueOf(outCardNumber).equals(luckyNum)) {
                        System.out.println("恭喜您成为本月幸运会员！");
                    } else {
                        System.out.println("抱歉，您不是本月幸运会员");
                    }
                    break;
                default:
                    System.out.println("您的输入有误！");
            }
            System.out.print("继续吗？（y/n）:");
            String choose = scanner.next();
            if ("y".equals(choose)) {
                continue dede;
            } else if ("n".equals(choose)) {
                System.out.println("系统退出，谢谢使用！");
                break dede;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(UserKu[i] + passwordKu[i]);
        }
    }
}