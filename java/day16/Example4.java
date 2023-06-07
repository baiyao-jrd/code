package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/0:38
 * @Description:
 */
public class Example4 {
    public static int[] getConcatenation(int[] nums) {
        int[] intArr = new int[nums.length * 2];

        for (int index = 0; index < nums.length; index++) {
            intArr[index] = nums[index];
            intArr[index + nums.length] = nums[index];
        }

        return intArr;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 4, -3, 6};
        int[] ints1 = new int[]{};

        int[] concatenation = getConcatenation(ints1);

        for (int i : concatenation) {
            System.out.print(i + " ");
        }
    }
}
