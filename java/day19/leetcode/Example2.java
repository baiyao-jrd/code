package day19.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/9:37
 * @Description:
 */
public class Example2 {
    public static char repeatedCharacter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.split("").length; i++) {
            if (stringBuilder.indexOf(s.split("")[i]) == -1) {
                stringBuilder.append(s.split("")[i]);
            } else {
                return s.split("")[i].charAt(0);
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
        System.out.println(repeatedCharacter("abcdd"));
    }
}
