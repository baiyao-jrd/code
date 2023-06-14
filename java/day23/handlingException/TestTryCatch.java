package day23.handlingException;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:31
 * @Description:
 */
public class TestTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入被除数: ");
                int a = scanner.nextInt();
                System.out.print("请输入除数: ");
                int b = scanner.nextInt();

                System.out.println(a + " + " + b + " = " + (a / b));

                break;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("除零异常");
            }

            System.out.println("输入无效，请重新输入~~ ");
        }

        System.out.println("程序结束");
    }
}
