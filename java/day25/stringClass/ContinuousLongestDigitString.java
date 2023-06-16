package day25.stringClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/16/14:46
 * @Description:    在字符串中找到连续最长数字串，打印并返回字符串的长度
 */
public class ContinuousLongestDigitString {
    public static void main(String[] args) {
        System.out.println("最长数字串: " + method("abcd12345cd125se123456789yht25t") + ", 长度: " + method("abcd12345cd125se123456789yht25t").length());
    }

    public static String method(String str) {
//        String[] split = str.split("\\D+");
        String[] split = str.split("[a-zA-Z]+");

        String longest = "";

        for (String s : split) {
            if (s.length() > longest.length()) {
                String temp = s;
                s = longest;
                longest = temp;
            }
        }

        return longest;
    }
}
