package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/23:29
 * @Description:
 */
public class Example10 {
    public static int findCenter(int[][] edges) {
        for (int i : edges[0]) {
            for (int j : edges[1]) {
                if (i == j)
                    return i;
            }
        }

        return -1;
    }
}
