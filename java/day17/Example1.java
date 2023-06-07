package day17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/12:30
 * @Description:
 */
public class Example1 {
    public static String decodeMessage(String key, String message) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        List<String> strList = Arrays.asList(key.replaceAll("\\s", "").split(""));
        int i = 'a';

        for (String s : strList) {
            if (hashMap.get(s) == null) {
                hashMap.put(s, (char) i + "");
                i++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (String keyWord : message.split("")) {
            if (" ".equals(keyWord)) {
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(hashMap.get(keyWord));
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}
