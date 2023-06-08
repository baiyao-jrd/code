package day18;

import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/14:33
 * @Description:
 */
public class Example6 {
    public static int[][] largestLocal(int[][] grid) {
        int[][] returnArr = new int[grid.length - 2][grid.length - 2];

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid.length - 1; j++) {
                returnArr[i - 1][j - 1] = Stream.of(grid[i - 1][j - 1], grid[i - 1][j], grid[i - 1][j + 1], grid[i][j - 1], grid[i][j], grid[i][j + 1], grid[i + 1][j - 1], grid[i + 1][j], grid[i + 1][j + 1]).mapToInt(Integer::intValue).max().orElse(0);
            }
        }

        return returnArr;
    }

    public static void main(String[] args) {
    }
}
