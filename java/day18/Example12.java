package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/23:21
 * @Description:
 */
public class Example12 {
    public static boolean checkIfPangram(String sentence) {
        boolean flag = true;

        for (int i = 97; i <= 122; i++) {
            if (!sentence.contains((char)i + "")) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
        System.out.println(checkIfPangram("onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab"));
    }
}
