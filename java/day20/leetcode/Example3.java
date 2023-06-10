package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/15:06
 * @Description:
 */
public class Example3 {
    public static int calculateTime(String keyboard, String word) {
        int[] distance = new int[word.length()];

        for (int i = 0; i < distance.length; i++) {
            if (i == 0) {
                distance[0] = keyboard.indexOf(word.charAt(0));
            } else {
                distance[i] = Math.abs(keyboard.indexOf(word.charAt(i)) -  keyboard.indexOf(word.charAt(i - 1)));
            }
        }

        for (int i = 1; i < distance.length; i++) {
            distance[0] += distance[i];
        }

        return distance[0];
    }

    public static void main(String[] args) {
        System.out.println(calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));

        System.out.println(calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }
}
