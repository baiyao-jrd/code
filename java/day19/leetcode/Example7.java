package day19.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/11:19
 * @Description:
 */
public class Example7 {
    public static int differenceOfSum(int[] nums) {
        int wholeSum = 0, splitSum = 0;

        for (int num : nums) {
            wholeSum += num;
            for (String s : (num + "").split("")) {
                splitSum += s.charAt(0) - 48;
            }
        }

        return Math.abs((wholeSum - splitSum));
    }

    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{1, 15, 6, 3}));
        System.out.println(differenceOfSum(new int[]{1, 2, 3, 4}));
    }
}
