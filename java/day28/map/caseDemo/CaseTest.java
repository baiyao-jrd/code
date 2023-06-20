package day28.map.caseDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/14:27
 * @Description:    有一个字符串, 包含空格等标点符号, 忽略大小写, 统计出现次数最多的字母以及次数
 */
public class CaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入字符串: ");
        String next = scanner.next();

        System.out.println(next.toLowerCase().replaceAll("[^a-z]", ""));

        Statistic_two(next);
    }

    private static void Statistic_two(String next) {
        int[] ints = new int[26];

        for (char c : next.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                ints[String.valueOf(c).toLowerCase().charAt(0) - 97]++;
            }
        }

        int max = 0;

        for (int anInt : ints) {
            if (anInt > max) {
                max = anInt;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == max) {
                System.out.println((char) (Character.valueOf((char)i) + 97) + " : " + ints[i]);
            }
        }
    }

    private static String Statistic_one(String next) {
        HashMap<String, Integer> map = new HashMap<>();

        for (char c : next.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (map.containsKey(String.valueOf(c).toLowerCase())) {
                    map.put(String.valueOf(c).toLowerCase(), map.get(String.valueOf(c).toLowerCase()) + 1);
                } else {
                    map.put(String.valueOf(c).toLowerCase(), 1);
                }
            }
        }

        int max = 0;

        for (Map.Entry<String, Integer> ent : map.entrySet()) {
            if (ent.getValue() > max) {
                max = ent.getValue();
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                stringBuilder.append(entry + "\t");
            }
        }

        return stringBuilder.toString();
    }
}