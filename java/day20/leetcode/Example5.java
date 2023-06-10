package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/15:38
 * @Description:
 */
public class Example5 {
    public static int sumOfMultiples(int n) {
        int flag = 0;

        for (int i = 1; i <= n; i++) {
            flag += (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) ? i : 0;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
        System.out.println(sumOfMultiples(10));
        System.out.println(sumOfMultiples(9));
    }
}
