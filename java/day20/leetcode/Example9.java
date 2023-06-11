package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/22:34
 * @Description:
 */
public class Example9 {
    public static String removeTrailingZeros(String num) {
        return reverse(num);
    }

//    public static String reverse(String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        List<String> strings = Arrays.asList(str.split(""));
//        for (int i = strings.size() - 1; i >= 0 ; i--) {
//            stringBuilder.append(strings.get(i));
//        }
//
//        return stringBuilder.toString();
//    }

    public static String reverse(String str) {
        return str.replaceAll("0+$", "");
    }

    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("51230100"));
        System.out.println(removeTrailingZeros("123"));
    }
}
