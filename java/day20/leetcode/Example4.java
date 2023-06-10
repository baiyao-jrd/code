package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/15:28
 * @Description:
 */
public class Example4 {
    public static int minCount(int[] coins) {
        int flag = 0;

        for (int coin : coins) {
            flag += (coin % 2 == 0 ? (coin / 2) : Math.ceil((double)coin / 2));
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(minCount(new int[]{4, 2, 1}));

        System.out.println(minCount(new int[]{2, 3, 10}));
    }
}
