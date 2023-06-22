package day31.iostream;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/16:03
 * @Description:    用Scanner在控制台接收键盘输入的各种类型数据
 */
public class ScannerSystemInTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入姓名: ");
        String name = scanner.nextLine();

        System.out.print("输入性别: ");
        char gender = scanner.nextLine().charAt(0);

        System.out.print("输入年龄: ");
        int age = scanner.nextInt();

        System.out.print("输入电话: ");
        long phoneNumber = scanner.nextLong();

        System.out.print("输入邮箱: ");
        String mail = scanner.next();

        System.out.println("" +
                "姓名: " + name +
                ", 性别: " + gender +
                ", 年龄: " + age +
                ", 电话: " + phoneNumber +
                ", 邮箱: " + mail +
                "");

        scanner.close();
    }
}
