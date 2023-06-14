package day23.exception;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:14
 * @Description:
 */
public class InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数: ");

        // 输入非整数 -> InputMismatchException
        int intNum = scanner.nextInt();

        System.out.println("您输入的整数是: " + intNum);
    }
}
