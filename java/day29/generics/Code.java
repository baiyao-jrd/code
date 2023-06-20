package day29.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/12:35
 * @Description:    随机生成10组6位字符组成的验证码放到集合中 -> 验证码 -> 大小写字母, 数字字符
 */
public class Code {
    public static void main(String[] args) {
        Iterator<String> iterator = random(8, 20).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static ArrayList<String> random(int groups, int bits) {
        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < groups; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < bits; j++) {
                int random;

                do {
                    random = new Random().nextInt(123);
                } while (random < 48 || (random > 57 && random < 65) || (random > 90 && random < 97));
                stringBuilder.append((char)random);
            }

            str.add(stringBuilder.toString());
        }

        return str;
    }
}
