package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/23:13
 * @Description:
 */
public class Example2 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
