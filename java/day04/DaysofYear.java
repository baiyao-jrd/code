package day04;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/09/16:57
 * @Description: 判断某天是当年的第几天
 */
public class DaysofYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年：");
        int year = scanner.nextInt();

        System.out.println("请输入月：");
        int month = scanner.nextInt();

        System.out.println("请输入日：");
        int day = scanner.nextInt();

        int daysOfYear = day;

        switch (month - 1) {
            case 11:
                daysOfYear += 30;
            case 10:
                daysOfYear += 31;
            case 9:
                daysOfYear += 30;
            case 8:
                daysOfYear += 31;
            case 7:
                daysOfYear += 31;
            case 6:
                daysOfYear += 30;
            case 5:
                daysOfYear += 31;
            case 4:
                daysOfYear += 30;
            case 3:
                daysOfYear += 31;
            case 2:
                daysOfYear += 28;
            case 1:
                daysOfYear += 31;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "年" + month + "月" + day + "日是本年的第【" + ++daysOfYear + "】天。");
        } else {
            System.out.println(year + "年" + month + "月" + day + "日是本年的第【" + daysOfYear + "】天。");
        }
    }
}
