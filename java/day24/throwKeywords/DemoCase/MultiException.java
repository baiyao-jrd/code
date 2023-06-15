package day24.throwKeywords.DemoCase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/13:49
 * @Description:
 */
public class MultiException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入被除数: ");
                int a = scanner.nextInt();

                System.out.print("请输入除数: ");
                int b = scanner.nextInt();

                System.out.println("结果: " + (a / b));
                break;
            } catch (ArithmeticException | InputMismatchException e) {
                e.printStackTrace();
                System.out.println("请重新输入~");
                scanner.nextLine();
            }
        }
    }
}
