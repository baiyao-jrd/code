package day26.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/13:01
 * @Description:    长度为10的数组 -> {26, 67, 49, 38, 52, 66, 7, 71, 56, 87}
 *                  奇数放在数组的左侧, 偶数放在数组的右侧
 *                  所有的奇数和偶数都各自实现从小到大排列
 */
public class LeftOddRightEven {
    public static void main(String[] args) {
        int[] ints = {26, 67, 49, 38, 52, 66, 7, 71, 56, 87};

        for (String i : sortLogic(ints)) {
            System.out.print(i + " ");
        }
    }

    public static String[] sortLogic(int[] arr) {

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int anInt : arr) {
            if (anInt % 2 == 0) {
                even.append(anInt + " ");
            } else {
                odd.append(anInt + " ");
            }
        }

        String[] oddSplit = odd.toString().split(" ");
        String[] evenSplit = even.toString().split(" ");

        Arrays.sort(oddSplit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        Arrays.sort(evenSplit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        String[] strings = new String[oddSplit.length + evenSplit.length];

        for (int i = 0, j = oddSplit.length; i < oddSplit.length && j < strings.length; i++, j++) {
            strings[i] = oddSplit[i];
            strings[j] = evenSplit[j - oddSplit.length];
        }

        return strings;
    }
}