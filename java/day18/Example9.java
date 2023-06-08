package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/16:23
 * @Description:
 */
public class Example9 {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {
            if (sentence.split(" ").length > max)
                max = sentence.split(" ").length;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        System.out.println(mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
    }
}
