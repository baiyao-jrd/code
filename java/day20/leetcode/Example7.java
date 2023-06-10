package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/16:15
 * @Description:
 */
public class Example7 {
    public static int numberOfMatches(int n) {
        int flag = 0;

        for (int i = n; i != 2 && i != 1 ; ) {
            flag += (int)(Math.floor((double)i / 2));

            i = (int)(Math.ceil((double)i / 2));
        }

        return n == 1 ? flag : ++flag;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));

        System.out.println(numberOfMatches(14));

        System.out.println(numberOfMatches(1));
    }
}
