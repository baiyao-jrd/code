package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:45
 * @Description: 判断某一年是否是闰年
 */
public class LeapYearDemo {
    public static void main(String[] args) {
        int year = 2023;
        Boolean flag = (year % 4 == 0) & (year % 100 != 0) | year % 400 == 0;
        System.out.println(year + "年是" + (flag ? "闰" : "平") + "年" );
    }
}
