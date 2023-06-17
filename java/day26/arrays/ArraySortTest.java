package day26.arrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/11:51
 * @Description:
 */
public class ArraySortTest {
    public static void main(String[] args) {
        int[] ints = {1, 4, 6, 8, -1, -5, 3};

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
