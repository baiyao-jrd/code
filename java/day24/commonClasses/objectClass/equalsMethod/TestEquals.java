package day24.commonClasses.objectClass.equalsMethod;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/14:59
 * @Description:
 */
public class TestEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入整数a: ");
        int a = scanner.nextInt();

        System.out.print("请输入整数b: ");
        int b = scanner.nextInt();

        System.out.println("判断a,b是否相等: " + (a == b));

        System.out.print("请输入字符串m: ");
        String m = scanner.next();

        System.out.print("请输入字符串n: ");
        String n = scanner.next();

        System.out.println("判断字符串m,n是否相等(==): " + (m == n));
        System.out.println("判断字符串m,n是否相等(equals): " + (m.equals(n)));
    }
}
