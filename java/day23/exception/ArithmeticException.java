package day23.exception;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:11
 * @Description:
 */
public class ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入被除数: ");
        int a = scanner.nextInt();

        System.out.println("请输入除数: ");
        int b = scanner.nextInt();

        // ArithmeticException: / by zero
        double c = a / b;

        System.out.println("a ÷ b = " + c);
    }
}
