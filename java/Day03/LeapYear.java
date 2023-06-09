package day03;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/17:31
 * @Description: 求某一年是否为闰年 -> 使用if else双分支语句
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年份：");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "年是闰年。");
        } else {
            System.out.println(year + "年是平年。");
        }
    }
}
