package day24.throwKeywords.DemoCase;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/14:24
 * @Description:
 */
public class LoginTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入用户名: ");
                String username = scanner.next();

                System.out.print("请输入密码: ");
                String password = scanner.next();

                if (!username.equals("江润冬") && !password.equals("niHao")) {
                    throw new LoginException("密码不正确");
                }

                System.out.println("登录成功");

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + ", 请重新输入");
            }
        }
    }
}
