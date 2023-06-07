package day08;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/18:21
 * @Description: 打鱼还是晒网 -> 从1990-01-01开始，三天打鱼两天晒网 -> 输入年月日 -> 判断一下今天是打鱼还是晒网
 */
public class FishingOrDryNet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年：");
        int year = scanner.nextInt();

        System.out.print("请输入月：");
        int month = scanner.nextInt();

        System.out.print("请输入日：");
        int day = scanner.nextInt();

        //1. 从1970-01-01到现在有多少天
        int countLeapYears = 0, daysOfYear = 0;
        for (int leapOrCommonYear = 1970; leapOrCommonYear < year; leapOrCommonYear++) {
            if (leapOrCommonYear(leapOrCommonYear))
                countLeapYears++;
        }

        daysOfYear = (year - 1970 - countLeapYears) * 365  + countLeapYears * 366;

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
        };

        daysOfYear += day;

        if (leapOrCommonYear(year)) daysOfYear++;

        //2. 模5得到一个余数，余数在3之内即为打鱼，三之外即为晒网
        String fishingOrDryNet = (daysOfYear % 5) <= 3 ? "打鱼" : "晒网";

        System.out.println(year + "-" + month + "-" + day + "应该" + fishingOrDryNet);
    }

    private static Boolean leapOrCommonYear(int leapOrCommonYear) {
        return (leapOrCommonYear % 4 == 0 && leapOrCommonYear % 100 != 0) || leapOrCommonYear % 400 == 0;
    }

}
