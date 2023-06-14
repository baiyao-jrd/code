package day23.enumCase;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/10:34
 * @Description:
 */
public class WeekTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int intValue = scanner.nextInt();

            if (Week.getByValue(intValue) != null) {
                System.out.println(Week.getByValue(intValue).name());
                System.out.println(Week.getByValue(intValue).ordinal());

                int ordinal = Week.getByValue(intValue).ordinal();

                switch (ordinal) {
                    case 0 :
                        System.out.println("星期一");
                        break;
                    case 1 :
                        System.out.println("星期二");
                        break;
                    case 2 :
                        System.out.println("星期三");
                        break;
                    case 3 :
                        System.out.println("星期四");
                        break;
                    case 4 :
                        System.out.println("星期五");
                        break;
                    case 5 :
                        System.out.println("星期六");
                        break;
                    case 6 :
                        System.out.println("星期日");
                        break;
                }

                System.out.println("******************************");
            } else {
                System.out.println("输入参数无效, 请重新输入~~");
            }
        }
    }
}
