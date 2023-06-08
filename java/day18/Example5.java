package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/14:12
 * @Description:
 */
public class Example5 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int flag = 0;

         for (String word : words) {
            for (String s : word.split("")) {
                if (!allowed.contains(s)) {
                    flag++;
                    break ;
                }
            }
        }

        return words.length - flag;
    }

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
}
