package day19.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/12:12
 * @Description:
 */
public class Example10 {
    public static int minimumSum(int num) {
        List<String> strings = Arrays.asList((num + "").split(""));
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (a.charAt(0)) - b.charAt(0);
            }
        });

        return (strings.get(0).charAt(0) - 48) * 10 + (strings.get(2).charAt(0) - 48) + (strings.get(1).charAt(0) - 48) * 10 + (strings.get(3).charAt(0) - 48);
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
        System.out.println(minimumSum(4009));
    }
}
