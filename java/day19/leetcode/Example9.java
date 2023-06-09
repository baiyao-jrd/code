package day19.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/11:51
 * @Description:
 */
public class Example9 {
    public static List<String> cellsInRange(String s) {
        ArrayList<String> strings = new ArrayList<>();

        for (int i = s.charAt(0); i <= s.charAt(3); i++) {
            for (int j = s.charAt(1) - 48; j <= s.charAt(4) - 48; j++) {
                strings.add((char)(i) + "" + j);
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        for (String s : cellsInRange("K1:L2")) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : cellsInRange("A1:F1")) {
            System.out.print(s + " ");
        }
    }
}
