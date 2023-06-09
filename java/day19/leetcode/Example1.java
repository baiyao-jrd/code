package day19.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/9:21
 * @Description:
 */
public class Example1 {
    public static int[] shuffle(int[] nums, int n) {
        int[] intArr = new int[2 * n];

        for (int i = 0, j = n, k = 0; i < n && j < 2 * n; i++, j++, k++) {
            intArr[k] = nums[i];
            intArr[++k] = nums[j];
        }

        return intArr;
    }

    public static void main(String[] args) {
        for (int i : shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : shuffle(new int[]{1, 1, 2, 2}, 2)) {
            System.out.print(i + " ");
        }
    }
}
