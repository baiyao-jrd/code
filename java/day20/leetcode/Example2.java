package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/14:42
 * @Description:
 */
public class Example2 {
    public static int maximizeSum(int[] nums, int k) {
        int max = 0, flag = findMaxValue(nums);

        for (int i = 0; i < k; i++) {
            max += flag++;
        }

        return max;
    }

    public static int findMaxValue(int[] intArr) {
        int max = Integer.MIN_VALUE;
        for (int value : intArr) {
            if (value > max)
                max = value;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[]{1, 2, 3, 4, 5}, 3));

        System.out.println(maximizeSum(new int[]{5,5,5}, 2));
    }
}
