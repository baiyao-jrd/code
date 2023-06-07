package Day03;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/17:23
 * @Description: 求某一年2月份有多少天 -> 练习if语句 -> 单分支
 */
public class DaysOfFebruaryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年份：");
        int year = scanner.nextInt();

        int daysOfFebruary = 28;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)    daysOfFebruary++;

        System.out.println(year + "年的2月份一共有" + daysOfFebruary + "天");
    }
}
