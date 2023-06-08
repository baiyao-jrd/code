package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/23:01
 * @Description:
 */
public class Example11 {
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        leftSum[0] = rightSum[nums.length - 1] = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                leftSum[i] += nums[j];
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                rightSum[i] += nums[j];
            }
        }

        for (int i = 0; i < leftSum.length; i++) {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return leftSum;
    }

    public static void main(String[] args) {
        for (int i : leftRightDifference(new int[]{10, 4, 8, 3})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : leftRightDifference(new int[]{1})) {
            System.out.print(i + " ");
        }
    }
}
