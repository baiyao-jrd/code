package test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/26/17:54
 * @Description:
 */
public class Example1 {
    public static String removeVowels(String s) {
        StringBuffer str = new StringBuffer();

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) != 'a' && s.charAt(index) != 'e' && s.charAt(index) != 'i' && s.charAt(index) != 'o' && s.charAt(index) != 'u')
                str.append(s.charAt(index));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "leetcodei";
        System.out.println(removeVowels(s));
    }
}
