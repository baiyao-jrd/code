package day25.stringClass;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/16/15:21
 * @Description: 获取两个字符串中最大的相同子串
 *
 *               "abcwerthelloyuiodef"
 *               "cvhellobnm"
 */
public class MaximumSameString {
    public static void main(String[] args) {
        System.out.println(maximumSameString("abcwerthelloyuiodef", "cvhellobnm"));
    }

    public static String maximumSameString(String str1, String str2) {
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i; j < str1.length(); j++) {
                String substring = str1.substring(i, j);

                if (str2.contains(substring)) {
                    strings.add(substring);
                }
            }
        }

        String longest = "";

        for (String string : strings) {
            if (string.length() > longest.length()) {
                longest = string;
            }
        }

        return longest;
    }
}
