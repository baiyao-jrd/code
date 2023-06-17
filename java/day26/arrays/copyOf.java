package day26.arrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/12:23
 * @Description:
 */
public class copyOf {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(Arrays.copyOf(ints, ints.length - 2)));
        System.out.println(Arrays.toString(Arrays.copyOf(ints, ints.length + 2)));
    }
}
