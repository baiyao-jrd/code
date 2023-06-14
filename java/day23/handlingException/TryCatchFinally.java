package day23.handlingException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:58
 * @Description:
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入1~7的星期值: ");
                int value = scan.nextInt();

                Week week = Week.getByValue(value);
                System.out.println(week.name());

                break;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("输入不匹配");
                scan.next();
            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("空指针异常");
            } finally {
                System.out.println("永远都要执行");
            }

            System.out.print("请重新输入~~");
        }

        System.out.println("程序结束");
    }
}
