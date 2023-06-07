package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/18:36
 * @Description: n个字符串的拼接
 * 可将n个字符串拼接起来，每个字符串之间使用指定字符分割
 */
public class NStrConcat {
    public static String nStrConcat(String seg, String... strs) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < strs.length; i++) {
            if (i == strs.length - 1) {
                stringBuffer.append(strs[i]);
            } else {
                stringBuffer.append(strs[i] + seg + " ");
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(nStrConcat(",", "ni", "hao", "a", "~~"));
        System.out.println(nStrConcat(","));
    }
}
