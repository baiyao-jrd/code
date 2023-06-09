package day19.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/10:06
 * @Description:
 */
public class Example4 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> booleans = new ArrayList<>();

        for (int candy : candies) {
            if (candy + extraCandies >= Arrays.stream(candies).max().getAsInt()) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }
        }

        return booleans;
    }

    public static void main(String[] args) {
        for (Boolean aBoolean : kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)) {
            System.out.print(aBoolean + " ");
        }
        System.out.println();

        for (Boolean kidsWithCandy : kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)) {
            System.out.print(kidsWithCandy + " ");
        }
        System.out.println();
        for (Boolean kidsWithCandy : kidsWithCandies(new int[]{12, 1, 12}, 10)) {
            System.out.print(kidsWithCandy + " ");
        }
    }

}
