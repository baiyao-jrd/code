package day24.throwKeywords.DemoCase;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/14:16
 * @Description:
 */
public class AgeIllegalExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年龄: ");
        int age = scanner.nextInt();

        if (age > 120 || age < 0) {
            try {
                throw new AgeIllegalException("年龄输入无效");
            } catch (AgeIllegalException e) {
                e.printStackTrace();
                System.out.println("*****************************");
                System.out.println(e.getMessage());
            }
        }
    }
}
