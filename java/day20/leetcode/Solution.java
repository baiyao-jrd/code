package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/23:23
 * @Description:
 */
public class Solution {
    public static String removeTrailingZeros(String num) {
        return num.replaceAll("0+$", "");
    }
}
