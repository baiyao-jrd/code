package day25.stringClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/16/15:13
 * @Description:    获取一个字符串在另一个字符串中出现的次数
 *                  "ab"
 *                  "abababkkcadkabkebfkabkskab"
 */
public class Occurrences {
    public static void main(String[] args) {
        System.out.println(findTimes("abababkkcadkabkebfkabkskab", "ab"));
    }

    public static int findTimes(String father, String sub) {
        return (father.length() - father.replaceAll(sub, "").length()) / sub.length();
    }
}
