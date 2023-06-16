package day25.stringClass;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/16/13:37
 * @Description:
 */
public class CommonMethodsOfString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = new String("baiYao");
        String b = "baiYao";
        String c = new String("baiyao");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        // 严格区分大小写
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println("Bz".compareTo("BZ"));
        System.out.println("Bz".compareToIgnoreCase("BZ"));
        System.out.println((int)'A');

        System.out.println("abcdefg".length());

        System.out.println("baiYao".indexOf('Y'));
        System.out.println("baiYao".indexOf('y'));

        System.out.println("baiYao".indexOf("Yao"));
        System.out.println("baiYao".indexOf("yao"));

        System.out.println("baiYaoYao".indexOf("Yao"));
        System.out.println("baiYaoYao".lastIndexOf("Yao"));
        System.out.println("baiYao".lastIndexOf("yao"));

        System.out.println("baiYao".substring(3));

          // 索引溢出
//        System.out.println("baiYao".substring(9));

        System.out.println("baiYao".substring(0));

        System.out.println("baiYao".substring(3, 6).length());

        System.out.println("baiYao".startsWith("bai"));
        System.out.println("baiYao".startsWith("Bai"));

        System.out.println("baiYao".endsWith("Yao"));
        System.out.println("baiYao".endsWith("yao"));

        char[] by = "baiYao".toCharArray();
        for (char charByte : by) {
            System.out.print(charByte + " ");
        }

        System.out.println();

        System.out.println("baiYao".charAt(3));

        System.out.println(" baiYao     ".trim().length());

        System.out.println("baiYao".toUpperCase());
        System.out.println("baiYao".toLowerCase());

        System.out.println("bai".concat("Yao"));

        String d = "bai";
        String e = "Yao";

        String f = d + e;

        String g = (d + e).intern();
        String h = "baiYao";

        System.out.println(f == g);
        System.out.println(g == h);

        System.out.println(Arrays.toString("baiYao".getBytes("GBK")));
        System.out.println(Arrays.toString("baiYao".getBytes("UTF-8")));

        byte[] bytesArr = "江润冬".getBytes("GBK");
        System.out.println(Arrays.toString(bytesArr));

        System.out.println(new String(bytesArr, "UTF-8"));
        System.out.println(new String(bytesArr, "GBK"));

        byte[] Arr = "江润冬".getBytes("ISO8859-1");
        System.out.println(new String(Arr, "ISO8859-1"));

        String[] split = "开源 | 协作 | 创新".split("\\|");
        for (String s : split) {
            System.out.print(s.trim() + " ");
        }

        System.out.println();

        System.out.println("baiYao".replaceFirst("a", ""));
        System.out.println("baiYao".replaceAll("a", ""));
    }
}
